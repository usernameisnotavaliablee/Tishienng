package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i {
    public static final org.apache.commons.net.ftp.h a = null;
    public static final org.apache.commons.net.ftp.h b = null;
    public static final org.apache.commons.net.ftp.h c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements org.apache.commons.net.ftp.h {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.net.ftp.h
        public boolean a(org.apache.commons.net.ftp.FTPFile r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements org.apache.commons.net.ftp.h {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.net.ftp.h
        public boolean a(org.apache.commons.net.ftp.FTPFile r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                return r1
            L4:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c implements org.apache.commons.net.ftp.h {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.net.ftp.h
        public boolean a(org.apache.commons.net.ftp.FTPFile r1) {
                r0 = this;
                if (r1 == 0) goto La
                boolean r1 = r1.isDirectory()
                if (r1 == 0) goto La
                r1 = 1
                return r1
            La:
                r1 = 0
                return r1
        }
    }

    static {
            org.apache.commons.net.ftp.i$a r0 = new org.apache.commons.net.ftp.i$a
            r0.<init>()
            org.apache.commons.net.ftp.i.a = r0
            org.apache.commons.net.ftp.i$b r0 = new org.apache.commons.net.ftp.i$b
            r0.<init>()
            org.apache.commons.net.ftp.i.b = r0
            org.apache.commons.net.ftp.i$c r0 = new org.apache.commons.net.ftp.i$c
            r0.<init>()
            org.apache.commons.net.ftp.i.c = r0
            return
    }

    public i() {
            r0 = this;
            r0.<init>()
            return
    }
}
