package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class p {
    static final com.bytedance.j.xt.tl.p.b a = null;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.bytedance.j.xt.tl.p.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int b(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                r1 = -1
                return r1
        }

        public int c(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                r1 = -1
                return r1
        }
    }

    @android.annotation.TargetApi(19)
    private static class c extends com.bytedance.j.xt.tl.p.b {
        private c() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ c(com.bytedance.j.xt.tl.p.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.j.xt.tl.p.b
        public int a(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                int r1 = r1.getTotalSwappablePss()
                return r1
        }

        @Override // com.bytedance.j.xt.tl.p.b
        public int b(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                int r1 = r1.getTotalPrivateClean()
                return r1
        }

        @Override // com.bytedance.j.xt.tl.p.b
        public int c(android.os.Debug.MemoryInfo r1) {
                r0 = this;
                int r1 = r1.getTotalSharedClean()
                return r1
        }
    }

    static {
            com.bytedance.j.xt.tl.p$c r0 = new com.bytedance.j.xt.tl.p$c
            r1 = 0
            r0.<init>(r1)
            com.bytedance.j.xt.tl.p.a = r0
            return
    }

    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(android.os.Debug.MemoryInfo r1) {
            com.bytedance.j.xt.tl.p$b r0 = com.bytedance.j.xt.tl.p.a
            int r1 = r0.a(r1)
            return r1
    }

    public static int b(android.os.Debug.MemoryInfo r1) {
            com.bytedance.j.xt.tl.p$b r0 = com.bytedance.j.xt.tl.p.a
            int r1 = r0.b(r1)
            return r1
    }

    public static int c(android.os.Debug.MemoryInfo r1) {
            com.bytedance.j.xt.tl.p$b r0 = com.bytedance.j.xt.tl.p.a
            int r1 = r0.c(r1)
            return r1
    }
}
