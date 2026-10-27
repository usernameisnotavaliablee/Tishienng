package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JSONToken {
    public static final int COLON = 17;
    public static final int COMMA = 16;
    public static final int DOT = 25;
    public static final int EOF = 20;
    public static final int ERROR = 1;
    public static final int FALSE = 7;
    public static final int FIELD_NAME = 19;
    public static final int HEX = 26;
    public static final int IDENTIFIER = 18;
    public static final int LBRACE = 12;
    public static final int LBRACKET = 14;
    public static final int LITERAL_FLOAT = 3;
    public static final int LITERAL_INT = 2;
    public static final int LITERAL_ISO8601_DATE = 5;
    public static final int LITERAL_STRING = 4;
    public static final int LPAREN = 10;
    public static final int NEW = 9;
    public static final int NULL = 8;
    public static final int RBRACE = 13;
    public static final int RBRACKET = 15;
    public static final int RPAREN = 11;
    public static final int SEMI = 24;
    public static final int SET = 21;
    public static final int TREE_SET = 22;
    public static final int TRUE = 6;
    public static final int UNDEFINED = 23;

    public JSONToken() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String name(int r0) {
            switch(r0) {
                case 1: goto L51;
                case 2: goto L4e;
                case 3: goto L4b;
                case 4: goto L48;
                case 5: goto L45;
                case 6: goto L42;
                case 7: goto L3f;
                case 8: goto L3c;
                case 9: goto L39;
                case 10: goto L36;
                case 11: goto L33;
                case 12: goto L30;
                case 13: goto L2d;
                case 14: goto L2a;
                case 15: goto L27;
                case 16: goto L24;
                case 17: goto L21;
                case 18: goto L1e;
                case 19: goto L1b;
                case 20: goto L18;
                case 21: goto L15;
                case 22: goto L12;
                case 23: goto Lf;
                case 24: goto Lc;
                case 25: goto L9;
                case 26: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Unknown"
            return r0
        L6:
            java.lang.String r0 = "hex"
            return r0
        L9:
            java.lang.String r0 = "."
            return r0
        Lc:
            java.lang.String r0 = ";"
            return r0
        Lf:
            java.lang.String r0 = "undefined"
            return r0
        L12:
            java.lang.String r0 = "TreeSet"
            return r0
        L15:
            java.lang.String r0 = "Set"
            return r0
        L18:
            java.lang.String r0 = "EOF"
            return r0
        L1b:
            java.lang.String r0 = "fieldName"
            return r0
        L1e:
            java.lang.String r0 = "ident"
            return r0
        L21:
            java.lang.String r0 = ":"
            return r0
        L24:
            java.lang.String r0 = ","
            return r0
        L27:
            java.lang.String r0 = "]"
            return r0
        L2a:
            java.lang.String r0 = "["
            return r0
        L2d:
            java.lang.String r0 = "}"
            return r0
        L30:
            java.lang.String r0 = "{"
            return r0
        L33:
            java.lang.String r0 = ")"
            return r0
        L36:
            java.lang.String r0 = "("
            return r0
        L39:
            java.lang.String r0 = "new"
            return r0
        L3c:
            java.lang.String r0 = "null"
            return r0
        L3f:
            java.lang.String r0 = "false"
            return r0
        L42:
            java.lang.String r0 = "true"
            return r0
        L45:
            java.lang.String r0 = "iso8601"
            return r0
        L48:
            java.lang.String r0 = "string"
            return r0
        L4b:
            java.lang.String r0 = "float"
            return r0
        L4e:
            java.lang.String r0 = "int"
            return r0
        L51:
            java.lang.String r0 = "error"
            return r0
    }
}
