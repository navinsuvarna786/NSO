/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/esc_locators.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.esc.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module esc_locators.yang */
public class esc_locators extends ConfNamespace {
    public static final int hash = 1454248082;
    public int hash() {
        return esc_locators.hash;
    }

    public static final String id = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_locators";
    public String id() {
        return esc_locators.id;
    }

    public static final String uri = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_locators";
    public String uri() {
        return esc_locators.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(esc_locators.uri);
    }

    public static final String prefix = "esc_locators";
    public String prefix() {
        return esc_locators.prefix;
    }

    public esc_locators() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}