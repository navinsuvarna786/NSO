/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/esc_interface.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.esc.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module esc_interface.yang */
public class esc_interface extends ConfNamespace {
    public static final int hash = 1069507739;
    public int hash() {
        return esc_interface.hash;
    }

    public static final String id = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_interface";
    public String id() {
        return esc_interface.id;
    }

    public static final String uri = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_interface";
    public String uri() {
        return esc_interface.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(esc_interface.uri);
    }

    public static final String prefix = "esc_interface";
    public String prefix() {
        return esc_interface.prefix;
    }

    public esc_interface() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}