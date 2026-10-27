package com.bytedance.j.cw.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface xt {

    public enum j extends java.lang.Enum<com.bytedance.j.cw.j.xt.xt.j> {
        public static final com.bytedance.j.cw.j.xt.xt.j cw = null;
        public static final com.bytedance.j.cw.j.xt.xt.j j = null;
        private static final /* synthetic */ com.bytedance.j.cw.j.xt.xt.j[] up = null;
        public static final com.bytedance.j.cw.j.xt.xt.j xt = null;

        /* renamed from: r, reason: collision with root package name */
        final int f2127r;

        static {
                com.bytedance.j.cw.j.xt.xt$j r0 = new com.bytedance.j.cw.j.xt.xt$j
                java.lang.String r1 = "LOW"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.bytedance.j.cw.j.xt.xt.j.j = r0
                com.bytedance.j.cw.j.xt.xt$j r1 = new com.bytedance.j.cw.j.xt.xt$j
                java.lang.String r4 = "NORMAL"
                r5 = 2
                r1.<init>(r4, r3, r5)
                com.bytedance.j.cw.j.xt.xt.j.xt = r1
                com.bytedance.j.cw.j.xt.xt$j r4 = new com.bytedance.j.cw.j.xt.xt$j
                java.lang.String r6 = "HIGHT"
                r7 = 3
                r4.<init>(r6, r5, r7)
                com.bytedance.j.cw.j.xt.xt.j.cw = r4
                com.bytedance.j.cw.j.xt.xt$j[] r6 = new com.bytedance.j.cw.j.xt.xt.j[r7]
                r6[r2] = r0
                r6[r3] = r1
                r6[r5] = r4
                com.bytedance.j.cw.j.xt.xt.j.up = r6
                return
        }

        j(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.f2127r = r3
                return
        }

        public static com.bytedance.j.cw.j.xt.xt.j valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.j.cw.j.xt.xt$j> r0 = com.bytedance.j.cw.j.xt.xt.j.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.j.cw.j.xt.xt$j r1 = (com.bytedance.j.cw.j.xt.xt.j) r1
                return r1
        }

        public static com.bytedance.j.cw.j.xt.xt.j[] values() {
                com.bytedance.j.cw.j.xt.xt$j[] r0 = com.bytedance.j.cw.j.xt.xt.j.up
                java.lang.Object r0 = r0.clone()
                com.bytedance.j.cw.j.xt.xt$j[] r0 = (com.bytedance.j.cw.j.xt.xt.j[]) r0
                return r0
        }

        public int j() {
                r1 = this;
                int r0 = r1.f2127r
                return r0
        }
    }
}
