package com.sun.mail.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n implements java.lang.Cloneable {
    private boolean[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private static com.sun.mail.imap.n.a[] b;
        public static final com.sun.mail.imap.n.a c = null;
        public static final com.sun.mail.imap.n.a d = null;
        public static final com.sun.mail.imap.n.a e = null;
        public static final com.sun.mail.imap.n.a f = null;
        public static final com.sun.mail.imap.n.a g = null;
        public static final com.sun.mail.imap.n.a h = null;
        public static final com.sun.mail.imap.n.a i = null;
        public static final com.sun.mail.imap.n.a j = null;
        public static final com.sun.mail.imap.n.a k = null;
        char a;

        static {
                r0 = 128(0x80, float:1.8E-43)
                com.sun.mail.imap.n$a[] r0 = new com.sun.mail.imap.n.a[r0]
                com.sun.mail.imap.n.a.b = r0
                r0 = 108(0x6c, float:1.51E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.c = r0
                r0 = 114(0x72, float:1.6E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.d = r0
                r0 = 115(0x73, float:1.61E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.e = r0
                r0 = 119(0x77, float:1.67E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.f = r0
                r0 = 105(0x69, float:1.47E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.g = r0
                r0 = 112(0x70, float:1.57E-43)
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.h = r0
                r0 = 99
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.i = r0
                r0 = 100
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.j = r0
                r0 = 97
                com.sun.mail.imap.n$a r0 = a(r0)
                com.sun.mail.imap.n.a.k = r0
                return
        }

        private a(char r2) {
                r1 = this;
                r1.<init>()
                r0 = 128(0x80, float:1.8E-43)
                if (r2 >= r0) goto La
                r1.a = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Right must be ASCII"
                r2.<init>(r0)
                throw r2
        }

        public static synchronized com.sun.mail.imap.n.a a(char r3) {
                java.lang.Class<com.sun.mail.imap.n$a> r0 = com.sun.mail.imap.n.a.class
                monitor-enter(r0)
                r1 = 128(0x80, float:1.8E-43)
                if (r3 >= r1) goto L1d
                com.sun.mail.imap.n$a[] r1 = com.sun.mail.imap.n.a.b     // Catch: java.lang.Throwable -> L15
                r2 = r1[r3]     // Catch: java.lang.Throwable -> L15
                if (r2 != 0) goto L17
                com.sun.mail.imap.n$a r2 = new com.sun.mail.imap.n$a     // Catch: java.lang.Throwable -> L15
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L15
                r1[r3] = r2     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r3 = move-exception
                goto L25
            L17:
                com.sun.mail.imap.n$a[] r1 = com.sun.mail.imap.n.a.b     // Catch: java.lang.Throwable -> L15
                r3 = r1[r3]     // Catch: java.lang.Throwable -> L15
                monitor-exit(r0)
                return r3
            L1d:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L15
                java.lang.String r1 = "Right must be ASCII"
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L15
                throw r3     // Catch: java.lang.Throwable -> L15
            L25:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r3
        }

        public java.lang.String toString() {
                r1 = this;
                char r0 = r1.a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                return r0
        }
    }

    public n() {
            r1 = this;
            r1.<init>()
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]
            r1.a = r0
            return
    }

    public n(com.sun.mail.imap.n.a r3) {
            r2 = this;
            r2.<init>()
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]
            r2.a = r0
            char r3 = r3.a
            r1 = 1
            r0[r3] = r1
            return
    }

    public n(com.sun.mail.imap.n r4) {
            r3 = this;
            r3.<init>()
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]
            r3.a = r0
            boolean[] r4 = r4.a
            r1 = 0
            int r2 = r0.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            return
    }

    public n(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]
            r2.a = r0
            r0 = 0
        La:
            int r1 = r3.length()
            if (r0 < r1) goto L11
            return
        L11:
            char r1 = r3.charAt(r0)
            com.sun.mail.imap.n$a r1 = com.sun.mail.imap.n.a.a(r1)
            r2.a(r1)
            int r0 = r0 + 1
            goto La
    }

    public void a(com.sun.mail.imap.n.a r3) {
            r2 = this;
            boolean[] r0 = r2.a
            char r3 = r3.a
            r1 = 1
            r0[r3] = r1
            return
    }

    public void b(com.sun.mail.imap.n r4) {
            r3 = this;
            r0 = 0
        L1:
            boolean[] r1 = r4.a
            int r2 = r1.length
            if (r0 < r2) goto L7
            return
        L7:
            boolean r1 = r1[r0]
            if (r1 == 0) goto L10
            boolean[] r1 = r3.a
            r2 = 1
            r1[r0] = r2
        L10:
            int r0 = r0 + 1
            goto L1
    }

    public boolean c(com.sun.mail.imap.n.a r2) {
            r1 = this;
            boolean[] r0 = r1.a
            char r2 = r2.a
            boolean r2 = r0[r2]
            return r2
    }

    public java.lang.Object clone() {
            r5 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L16
            com.sun.mail.imap.n r1 = (com.sun.mail.imap.n) r1     // Catch: java.lang.CloneNotSupportedException -> L16
            r0 = 128(0x80, float:1.8E-43)
            boolean[] r0 = new boolean[r0]     // Catch: java.lang.CloneNotSupportedException -> L15
            r1.a = r0     // Catch: java.lang.CloneNotSupportedException -> L15
            boolean[] r2 = r5.a     // Catch: java.lang.CloneNotSupportedException -> L15
            int r3 = r2.length     // Catch: java.lang.CloneNotSupportedException -> L15
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)     // Catch: java.lang.CloneNotSupportedException -> L15
            return r1
        L15:
            r0 = r1
        L16:
            return r0
    }

    public boolean e(com.sun.mail.imap.n r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean[] r2 = r5.a
            int r3 = r2.length
            if (r1 < r3) goto L9
            r5 = 1
            return r5
        L9:
            boolean r2 = r2[r1]
            if (r2 == 0) goto L14
            boolean[] r2 = r4.a
            boolean r2 = r2[r1]
            if (r2 != 0) goto L14
            return r0
        L14:
            int r1 = r1 + 1
            goto L2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.sun.mail.imap.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.sun.mail.imap.n r5 = (com.sun.mail.imap.n) r5
            r0 = 0
        L9:
            boolean[] r2 = r5.a
            int r3 = r2.length
            if (r0 < r3) goto L10
            r5 = 1
            return r5
        L10:
            boolean r2 = r2[r0]
            boolean[] r3 = r4.a
            boolean r3 = r3[r0]
            if (r2 == r3) goto L19
            return r1
        L19:
            int r0 = r0 + 1
            goto L9
    }

    public com.sun.mail.imap.n.a[] f() {
            r4 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1 = 0
        L6:
            boolean[] r2 = r4.a
            int r3 = r2.length
            if (r1 < r3) goto L15
            int r1 = r0.size()
            com.sun.mail.imap.n$a[] r1 = new com.sun.mail.imap.n.a[r1]
            r0.copyInto(r1)
            return r1
        L15:
            boolean r2 = r2[r1]
            if (r2 == 0) goto L21
            char r2 = (char) r1
            com.sun.mail.imap.n$a r2 = com.sun.mail.imap.n.a.a(r2)
            r0.addElement(r2)
        L21:
            int r1 = r1 + 1
            goto L6
    }

    public void g(com.sun.mail.imap.n.a r3) {
            r2 = this;
            boolean[] r0 = r2.a
            char r3 = r3.a
            r1 = 0
            r0[r3] = r1
            return
    }

    public void h(com.sun.mail.imap.n r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean[] r2 = r5.a
            int r3 = r2.length
            if (r1 < r3) goto L8
            return
        L8:
            boolean r2 = r2[r1]
            if (r2 == 0) goto L10
            boolean[] r2 = r4.a
            r2[r1] = r0
        L10:
            int r1 = r1 + 1
            goto L2
    }

    public int hashCode() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean[] r2 = r4.a
            int r3 = r2.length
            if (r0 < r3) goto L8
            return r1
        L8:
            boolean r2 = r2[r0]
            if (r2 == 0) goto Le
            int r1 = r1 + 1
        Le:
            int r0 = r0 + 1
            goto L2
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            boolean[] r2 = r4.a
            int r3 = r2.length
            if (r1 < r3) goto L10
            java.lang.String r0 = r0.toString()
            return r0
        L10:
            boolean r2 = r2[r1]
            if (r2 == 0) goto L18
            char r2 = (char) r1
            r0.append(r2)
        L18:
            int r1 = r1 + 1
            goto L6
    }
}
