# -*- mode: python; python-indent: 4 -*-
import ncs
import _ncs

class Upgrade(ncs.upgrade.Upgrade):
    """An upgrade 'class' that will be instantiated by NSO.
    """
    
    """ 'cdbsock' is a CDB session attached to the pre-upgrade 'running',
     'trans' is a MAAPI transaction attached to the upgrade transaction
    """
    def upgrade(self, cdbsock, trans):        
        """The upgrade 'method' that will be called by NSO.
        """            
        _ncs.cdb.start_session2(cdbsock, ncs.cdb.RUNNING, ncs.cdb.LOCK_SESSION | ncs.cdb.LOCK_WAIT)
        num = _ncs.cdb.num_instances(cdbsock, "/l3mplsvpn")

        for i in range(0, num):           
            name = str(_ncs.cdb.get(cdbsock, f"/l3mplsvpn[{i}]/name"))
            customer = str(_ncs.cdb.get(cdbsock, f"/l3mplsvpn[{i}]/customer"))
            # create a mandatory leaf 'description'
            description = "VPN for " + customer
            trans.set_elem(description, f"/l3mplsvpn{{{name}}}/description")    
        return True    
