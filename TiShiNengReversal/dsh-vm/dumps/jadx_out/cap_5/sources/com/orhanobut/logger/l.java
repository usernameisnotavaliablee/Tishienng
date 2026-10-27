package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l implements com.orhanobut.logger.f {
    private static final int f = 4000;
    private static final int g = 5;
    private static final char h = 9484;
    private static final char i = 9492;
    private static final char j = 9500;
    private static final char k = 9474;
    private static final java.lang.String l = "────────────────────────────────────────────────────────";
    private static final java.lang.String m = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final java.lang.String n = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final java.lang.String o = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final java.lang.String p = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private final int a;
    private final int b;
    private final boolean c;

    @androidx.annotation.NonNull
    private final com.orhanobut.logger.h d;

    @androidx.annotation.Nullable
    private final java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        int a;
        int b;
        boolean c;

        @androidx.annotation.Nullable
        com.orhanobut.logger.h d;

        @androidx.annotation.Nullable
        java.lang.String e;

        private b() {
                r1 = this;
                r1.<init>()
                r0 = 2
                r1.a = r0
                r0 = 0
                r1.b = r0
                r0 = 1
                r1.c = r0
                java.lang.String r0 = "PRETTY_LOGGER"
                r1.e = r0
                return
        }

        /* synthetic */ b(com.orhanobut.logger.l.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l a() {
                r2 = this;
                com.orhanobut.logger.h r0 = r2.d
                if (r0 != 0) goto Lb
                com.orhanobut.logger.i r0 = new com.orhanobut.logger.i
                r0.<init>()
                r2.d = r0
            Lb:
                com.orhanobut.logger.l r0 = new com.orhanobut.logger.l
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l.b b(@androidx.annotation.Nullable com.orhanobut.logger.h r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l.b c(int r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l.b d(int r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l.b e(boolean r1) {
                r0 = this;
                r0.c = r1
                return r0
        }

        @androidx.annotation.NonNull
        public com.orhanobut.logger.l.b f(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }
    }

    private l(@androidx.annotation.NonNull com.orhanobut.logger.l.b r2) {
            r1 = this;
            r1.<init>()
            com.orhanobut.logger.n.a(r2)
            int r0 = r2.a
            r1.a = r0
            int r0 = r2.b
            r1.b = r0
            boolean r0 = r2.c
            r1.c = r0
            com.orhanobut.logger.h r0 = r2.d
            r1.d = r0
            java.lang.String r2 = r2.e
            r1.e = r2
            return
    }

    /* synthetic */ l(com.orhanobut.logger.l.b r1, com.orhanobut.logger.l.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @androidx.annotation.Nullable
    private java.lang.String b(@androidx.annotation.Nullable java.lang.String r3) {
            r2 = this;
            boolean r0 = com.orhanobut.logger.n.d(r3)
            if (r0 != 0) goto L25
            java.lang.String r0 = r2.e
            boolean r0 = com.orhanobut.logger.n.b(r0, r3)
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L25:
            java.lang.String r3 = r2.e
            return r3
    }

    private java.lang.String c(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            com.orhanobut.logger.n.a(r2)
            java.lang.String r0 = "."
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    private int d(@androidx.annotation.NonNull java.lang.StackTraceElement[] r5) {
            r4 = this;
            com.orhanobut.logger.n.a(r5)
            r0 = 5
        L4:
            int r1 = r5.length
            r2 = -1
            if (r0 >= r1) goto L2b
            r1 = r5[r0]
            java.lang.String r1 = r1.getClassName()
            java.lang.Class<com.orhanobut.logger.k> r3 = com.orhanobut.logger.k.class
            java.lang.String r3 = r3.getName()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L28
            java.lang.Class<com.orhanobut.logger.j> r3 = com.orhanobut.logger.j.class
            java.lang.String r3 = r3.getName()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
            int r0 = r0 + r2
            return r0
        L28:
            int r0 = r0 + 1
            goto L4
        L2b:
            return r2
    }

    private void e(int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r1.f(r2, r3, r0)
            return
    }

    private void f(int r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4) {
            r1 = this;
            com.orhanobut.logger.n.a(r4)
            com.orhanobut.logger.h r0 = r1.d
            r0.a(r2, r3, r4)
            return
    }

    private void g(int r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8) {
            r5 = this;
            com.orhanobut.logger.n.a(r8)
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L2a
            r2 = r8[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "│ "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.f(r6, r7, r2)
            int r1 = r1 + 1
            goto Lf
        L2a:
            return
    }

    private void h(int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄"
            r1.f(r2, r3, r0)
            return
    }

    private void i(int r7, @androidx.annotation.Nullable java.lang.String r8, int r9) {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            boolean r1 = r6.c
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "│ Thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.f(r7, r8, r1)
            r6.h(r7, r8)
        L2b:
            int r1 = r6.d(r0)
            int r2 = r6.b
            int r1 = r1 + r2
            int r2 = r9 + r1
            int r3 = r0.length
            if (r2 <= r3) goto L3b
            int r9 = r0.length
            int r9 = r9 - r1
            int r9 = r9 + (-1)
        L3b:
            java.lang.String r2 = ""
        L3d:
            if (r9 <= 0) goto Lb3
            int r3 = r9 + r1
            int r4 = r0.length
            if (r3 < r4) goto L45
            goto Lb0
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 9474(0x2502, float:1.3276E-41)
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            r4.append(r2)
            r5 = r0[r3]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r5 = r6.c(r5)
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            r5 = r0[r3]
            java.lang.String r5 = r5.getMethodName()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r5 = " ("
            r4.append(r5)
            r5 = r0[r3]
            java.lang.String r5 = r5.getFileName()
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            r3 = r0[r3]
            int r3 = r3.getLineNumber()
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "   "
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = r4.toString()
            r6.f(r7, r8, r3)
        Lb0:
            int r9 = r9 + (-1)
            goto L3d
        Lb3:
            return
    }

    private void j(int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────"
            r1.f(r2, r3, r0)
            return
    }

    @androidx.annotation.NonNull
    public static com.orhanobut.logger.l.b k() {
            com.orhanobut.logger.l$b r0 = new com.orhanobut.logger.l$b
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // com.orhanobut.logger.f
    public void a(int r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8) {
            r5 = this;
            com.orhanobut.logger.n.a(r8)
            java.lang.String r7 = r5.b(r7)
            r5.j(r6, r7)
            int r0 = r5.a
            r5.i(r6, r7, r0)
            byte[] r0 = r8.getBytes()
            int r1 = r0.length
            r2 = 4000(0xfa0, float:5.605E-42)
            if (r1 > r2) goto L26
            int r0 = r5.a
            if (r0 <= 0) goto L1f
            r5.h(r6, r7)
        L1f:
            r5.g(r6, r7, r8)
            r5.e(r6, r7)
            return
        L26:
            int r8 = r5.a
            if (r8 <= 0) goto L2d
            r5.h(r6, r7)
        L2d:
            r8 = 0
        L2e:
            if (r8 >= r1) goto L41
            int r3 = r1 - r8
            int r3 = java.lang.Math.min(r3, r2)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0, r8, r3)
            r5.g(r6, r7, r4)
            int r8 = r8 + 4000
            goto L2e
        L41:
            r5.e(r6, r7)
            return
    }
}
