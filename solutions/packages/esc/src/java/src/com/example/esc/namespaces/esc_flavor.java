/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/esc_flavor.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.esc.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module esc_flavor.yang */
public class esc_flavor extends ConfNamespace {
    public static final int hash = 1717526697;
    public int hash() {
        return esc_flavor.hash;
    }

    public static final String id = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_flavor";
    public String id() {
        return esc_flavor.id;
    }

    public static final String uri = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_flavor";
    public String uri() {
        return esc_flavor.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(esc_flavor.uri);
    }

    public static final String prefix = "esc_flavor";
    public String prefix() {
        return esc_flavor.prefix;
    }

    public esc_flavor() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}
