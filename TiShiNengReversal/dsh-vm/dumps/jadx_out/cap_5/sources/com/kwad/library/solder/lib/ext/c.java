package com.kwad.library.solder.lib.ext;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    private final int aqS;
    private final java.lang.String arg;
    private final java.lang.String arh;
    private final java.lang.String ari;
    private final java.lang.String arj;
    private final java.lang.String ark;
    private final java.lang.String arl;
    private final java.lang.String arm;
    private final boolean arn;
    private final boolean aro;
    private final boolean arp;
    private java.util.concurrent.ExecutorService arq;
    private java.lang.String arr;
    private byte[] ars;
    private boolean art;
    private int aru;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private static final java.lang.String arv = null;
        private int aqS;
        private java.lang.String arg;
        private java.lang.String arh;
        private java.lang.String ari;
        private java.lang.String arj;
        private java.lang.String ark;
        private java.lang.String arl;
        private java.lang.String arm;
        private boolean arn;
        private boolean aro;
        private boolean arp;
        private java.util.concurrent.ExecutorService arq;
        private java.lang.String arr;
        private byte[] ars;
        private boolean art;
        private int arw;

        static {
                boolean r0 = Ax()
                if (r0 == 0) goto L9
                java.lang.String r0 = "base-1_apk"
                goto Lb
            L9:
                java.lang.String r0 = "base-1.apk"
            Lb:
                com.kwad.library.solder.lib.ext.c.a.arv = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 3
                r1.aqS = r0
                java.lang.String r0 = "sodler"
                r1.arg = r0
                java.lang.String r0 = "code-cache"
                r1.arh = r0
                java.lang.String r0 = "lib"
                r1.ari = r0
                java.lang.String r0 = "temp"
                r1.arj = r0
                java.lang.String r0 = com.kwad.library.solder.lib.ext.c.a.arv
                r1.arl = r0
                java.lang.String r0 = ".tmp"
                r1.ark = r0
                r0 = 0
                r1.aro = r0
                r1.arn = r0
                return
        }

        private static boolean Ax() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 == r1) goto L11
                r1 = 31
                if (r0 == r1) goto L11
                r1 = 32
                if (r0 != r1) goto Lf
                goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                r0 = 1
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c Ay() {
                r20 = this;
                r0 = r20
                com.kwad.library.solder.lib.ext.c r1 = new com.kwad.library.solder.lib.ext.c
                boolean r2 = r0.arn
                boolean r3 = r0.aro
                java.lang.String r4 = r0.arm
                java.lang.String r5 = r0.arg
                java.lang.String r6 = r0.arh
                java.lang.String r7 = r0.ari
                java.lang.String r8 = r0.arj
                java.lang.String r9 = r0.ark
                java.lang.String r10 = r0.arl
                int r11 = r0.aqS
                java.lang.String r12 = r0.arr
                byte[] r13 = r0.ars
                boolean r14 = r0.art
                boolean r15 = r0.arp
                r16 = r1
                java.util.concurrent.ExecutorService r1 = r0.arq
                r17 = r1
                int r1 = r0.arw
                r18 = 0
                r19 = r17
                r17 = r1
                r1 = r16
                r16 = r19
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r16 = r1
                return r16
        }

        public final com.kwad.library.solder.lib.ext.c.a a(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.arq = r1
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c.a bZ(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.arg = r1
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c.a bk(boolean r1) {
                r0 = this;
                r1 = 0
                r0.art = r1
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c.a bl(boolean r1) {
                r0 = this;
                r0.arp = r1
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c.a cj(int r1) {
                r0 = this;
                if (r1 <= 0) goto L4
                r0.aqS = r1
            L4:
                return r0
        }

        public final com.kwad.library.solder.lib.ext.c.a ck(int r1) {
                r0 = this;
                r0.arw = r1
                return r0
        }
    }

    private c(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, byte[] r12, boolean r13, boolean r14, java.util.concurrent.ExecutorService r15, int r16) {
            r0 = this;
            r0.<init>()
            r0.aqS = r10
            r0.arg = r4
            r0.arh = r5
            r0.ari = r6
            r0.arj = r7
            r0.ark = r8
            r0.arl = r9
            r0.arm = r3
            r0.arn = r1
            r0.aro = r2
            r0.arr = r11
            r0.ars = r12
            r0.art = r13
            r0.arp = r14
            r0.arq = r15
            r1 = r16
            r0.aru = r1
            return
    }

    /* synthetic */ c(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, byte[] r12, boolean r13, boolean r14, java.util.concurrent.ExecutorService r15, int r16, byte r17) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    public final int An() {
            r1 = this;
            int r0 = r1.aru
            return r0
    }

    public final java.lang.String Ao() {
            r1 = this;
            java.lang.String r0 = r1.arg
            return r0
    }

    public final java.lang.String Ap() {
            r1 = this;
            java.lang.String r0 = r1.arh
            return r0
    }

    public final java.lang.String Aq() {
            r1 = this;
            java.lang.String r0 = r1.ari
            return r0
    }

    public final java.lang.String Ar() {
            r1 = this;
            java.lang.String r0 = r1.arj
            return r0
    }

    public final java.lang.String As() {
            r1 = this;
            java.lang.String r0 = r1.ark
            return r0
    }

    public final java.lang.String At() {
            r1 = this;
            java.lang.String r0 = r1.arl
            return r0
    }

    public final boolean Au() {
            r1 = this;
            boolean r0 = r1.aro
            return r0
    }

    public final boolean Av() {
            r1 = this;
            boolean r0 = r1.arp
            return r0
    }

    public final java.util.concurrent.ExecutorService Aw() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.arq
            return r0
    }

    public final int getRetryCount() {
            r1 = this;
            int r0 = r1.aqS
            return r0
    }
}
