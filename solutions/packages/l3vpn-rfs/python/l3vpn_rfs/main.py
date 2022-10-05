# -*- mode: python; python-indent: 4 -*-
import ncs
from ncs.application import Service
import string
import random


# ------------------------
# SERVICE CALLBACK EXAMPLE
# ------------------------
class ServiceCallbacks(Service):

    @Service.create
    def cb_create(self, tctx, root, service, proplist):
        self.log.info(f"Service create(service='{service._path}')")
        for link in service.link:
          vars = ncs.template.Variables()
          vars.add('ID', link.id)
          vars.add('NAME', service.name)
          vars.add('DEVICE', link.device)
          vars.add('IP-ADDRESS', link.ip_address)
          vars.add('INTERFACE', link.interface)
          vars.add('MASK', link.mask)
          vars.add('RT', "65000:" + str(random.randrange(1, 65535)))
          template = ncs.template.Template(service)
          template.apply('l3vpn-rfs-template', vars)

# ---------------------------------------------
# COMPONENT THREAD THAT WILL BE STARTED BY NCS.
# ---------------------------------------------
class Main(ncs.application.Application):
    def setup(self):
        self.log.info('Main RUNNING')
        self.register_service('l3vpn-rfs-servicepoint', ServiceCallbacks)

    def teardown(self):
        self.log.info('Main FINISHED')
