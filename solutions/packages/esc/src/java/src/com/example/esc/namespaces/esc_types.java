/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/esc_types.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.esc.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module esc_types.yang */
public class esc_types extends ConfNamespace {
    public static final int hash = 542490364;
    public int hash() {
        return esc_types.hash;
    }

    public static final String id = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_types";
    public String id() {
        return esc_types.id;
    }

    public static final String uri = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_types";
    public String uri() {
        return esc_types.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(esc_types.uri);
    }

    public static final String prefix = "types";
    public String prefix() {
        return esc_types.prefix;
    }

    public esc_types() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}
