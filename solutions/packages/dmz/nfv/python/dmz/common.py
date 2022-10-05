from __future__ import absolute_import

import ncs
from _ncs import decrypt


def setup_crypto(tctx):
    with ncs.maapi.Maapi() as m:
        m.attach(tctx)
        try:
            m.install_crypto_keys()
        finally:
            m.detach(tctx)


def authgroup_password(tctx, root, authgrp_name):
    authgrp = root.ncs__devices.authgroups.group[authgrp_name]
    username = tctx.username

    if username in authgrp.umap:
        encpwd = authgrp.umap[username].remote_password
    else:
        encpwd = authgrp.default_map.remote_password
    print(f">>>>>>>>{encpwd}")
    return decrypt(str(encpwd))
