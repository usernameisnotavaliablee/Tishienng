package com.bytedance.msdk.core.vl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class m {
    private static final java.lang.String j = "m";
    private final java.util.Set<java.lang.String> cw;
    private android.os.Looper xt;





    /* renamed from: com.bytedance.msdk.core.vl.m$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.msdk.core.vl.r[] r0 = com.bytedance.msdk.core.vl.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.msdk.core.vl.m.AnonymousClass5.j = r0
                com.bytedance.msdk.core.vl.r r1 = com.bytedance.msdk.core.vl.r.j     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.msdk.core.vl.m.AnonymousClass5.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.msdk.core.vl.r r1 = com.bytedance.msdk.core.vl.r.xt     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.msdk.core.vl.m.AnonymousClass5.j     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.msdk.core.vl.r r1 = com.bytedance.msdk.core.vl.r.cw     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass5() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public m() {
            r2 = this;
            r2.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.xt = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.cw = r0
            return
    }

    public abstract void j();

    public abstract void j(java.lang.String r1);

    protected final synchronized void j(@androidx.annotation.NonNull java.lang.String[] r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<java.lang.String> r0 = r1.cw     // Catch: java.lang.Throwable -> L8
            java.util.Collections.addAll(r0, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    protected final synchronized boolean j(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            if (r2 != 0) goto Ld
            com.bytedance.msdk.core.vl.r r2 = com.bytedance.msdk.core.vl.r.j     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0.j(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            goto L15
        Ld:
            com.bytedance.msdk.core.vl.r r2 = com.bytedance.msdk.core.vl.r.xt     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0.j(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    protected final synchronized boolean j(@androidx.annotation.NonNull java.lang.String r3, com.bytedance.msdk.core.vl.r r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r2.cw     // Catch: java.lang.Throwable -> L37
            r0.remove(r3)     // Catch: java.lang.Throwable -> L37
            int[] r0 = com.bytedance.msdk.core.vl.m.AnonymousClass5.j     // Catch: java.lang.Throwable -> L37
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L37
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L37
            r0 = 1
            if (r4 == r0) goto L5b
            r1 = 2
            if (r4 == r1) goto L4a
            r1 = 3
            if (r4 == r1) goto L18
            goto L74
        L18:
            boolean r4 = r2.xt(r3)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L39
            java.util.Set<java.lang.String> r3 = r2.cw     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L74
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L37
            android.os.Looper r4 = r2.xt     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.core.vl.m$3 r4 = new com.bytedance.msdk.core.vl.m$3     // Catch: java.lang.Throwable -> L37
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r3.post(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r0
        L37:
            r3 = move-exception
            goto L77
        L39:
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L37
            android.os.Looper r1 = r2.xt     // Catch: java.lang.Throwable -> L37
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.core.vl.m$4 r1 = new com.bytedance.msdk.core.vl.m$4     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L37
            r4.post(r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r0
        L4a:
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L37
            android.os.Looper r1 = r2.xt     // Catch: java.lang.Throwable -> L37
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.core.vl.m$2 r1 = new com.bytedance.msdk.core.vl.m$2     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L37
            r4.post(r1)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r0
        L5b:
            java.util.Set<java.lang.String> r3 = r2.cw     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L74
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L37
            android.os.Looper r4 = r2.xt     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            com.bytedance.msdk.core.vl.m$1 r4 = new com.bytedance.msdk.core.vl.m$1     // Catch: java.lang.Throwable -> L37
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r3.post(r4)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r0
        L74:
            monitor-exit(r2)
            r3 = 0
            return r3
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r3
    }

    public synchronized boolean xt(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = com.bytedance.msdk.core.vl.m.j     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "permission not found:"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r1.concat(r3)     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.j.up.cw.xt(r0, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            r3 = 1
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }
}
