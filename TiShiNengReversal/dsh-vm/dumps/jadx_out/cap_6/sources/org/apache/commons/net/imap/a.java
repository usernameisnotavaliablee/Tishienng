package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 3;
    private static final java.lang.String f = "OK";
    private static final java.lang.String g = "NO";
    private static final java.lang.String h = "BAD";
    private static final java.lang.String i = "* ";
    private static final java.lang.String j = "+";
    private static final java.lang.String k = "^\\w+ (\\S+).*";
    private static final java.util.regex.Pattern l = null;
    private static final java.lang.String m = "^\\* (\\S+).*";
    private static final java.util.regex.Pattern n = null;
    private static final java.util.regex.Pattern o = null;

    static {
            java.lang.String r0 = "^\\w+ (\\S+).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.imap.a.l = r0
            java.lang.String r0 = "^\\* (\\S+).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.imap.a.n = r0
            java.lang.String r0 = "\\{(\\d+)\\}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.net.imap.a.o = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String r1) throws java.io.IOException {
            java.util.regex.Pattern r0 = org.apache.commons.net.imap.a.l
            int r1 = b(r1, r0)
            return r1
    }

    private static int b(java.lang.String r2, java.util.regex.Pattern r3) throws java.io.IOException {
            boolean r0 = e(r2)
            if (r0 == 0) goto L8
            r2 = 3
            return r2
        L8:
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L34
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            java.lang.String r1 = "OK"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L21
            r2 = 0
            return r2
        L21:
            java.lang.String r1 = "BAD"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2b
            r2 = 2
            return r2
        L2b:
            java.lang.String r1 = "NO"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L34
            return r0
        L34:
            org.apache.commons.net.MalformedServerReplyException r3 = new org.apache.commons.net.MalformedServerReplyException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received unexpected IMAP protocol response from server: '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "'."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static int c(java.lang.String r1) throws java.io.IOException {
            java.util.regex.Pattern r0 = org.apache.commons.net.imap.a.n
            int r1 = b(r1, r0)
            return r1
    }

    public static boolean d(int r1) {
            r0 = 3
            if (r1 != r0) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }

    public static boolean e(java.lang.String r1) {
            java.lang.String r0 = "+"
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    public static boolean f(int r0) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    public static boolean g(java.lang.String r1) {
            java.lang.String r0 = "* "
            boolean r1 = r1.startsWith(r0)
            return r1
    }

    public static int h(java.lang.String r1) {
            java.util.regex.Pattern r0 = org.apache.commons.net.imap.a.o
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.find()
            if (r0 == 0) goto L16
            r0 = 1
            java.lang.String r1 = r1.group(r0)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
        L16:
            r1 = -1
            return r1
    }
}
