/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/esc_datamodel.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.esc.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module esc_datamodel.yang */
public class esc_datamodel extends ConfNamespace {
    public static final int hash = 701389281;
    public int hash() {
        return esc_datamodel.hash;
    }

    public static final String id = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_datamodel";
    public String id() {
        return esc_datamodel.id;
    }

    public static final String uri = "_esc-nc-1.0:esc-nc-1.0#http://www.cisco.com/esc/esc_datamodel";
    public String uri() {
        return esc_datamodel.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(esc_datamodel.uri);
    }

    public static final String prefix = "esc_datamodel";
    public String prefix() {
        return esc_datamodel.prefix;
    }

    public esc_datamodel() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}
