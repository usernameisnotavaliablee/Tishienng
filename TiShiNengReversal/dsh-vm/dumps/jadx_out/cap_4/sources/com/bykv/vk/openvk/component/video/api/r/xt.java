package com.bykv.vk.openvk.component.video.api.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface xt<T> extends com.bykv.vk.openvk.component.video.api.xt.j {

    public enum j extends java.lang.Enum<com.bykv.vk.openvk.component.video.api.r.xt.j> {
        private static final /* synthetic */ com.bykv.vk.openvk.component.video.api.r.xt.j[] ae = null;
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j cw = null;
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j j = null;

        /* renamed from: m, reason: collision with root package name */
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j f1684m = null;

        /* renamed from: r, reason: collision with root package name */
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j f1685r = null;
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j up = null;
        public static final com.bykv.vk.openvk.component.video.api.r.xt.j xt = null;

        static {
                com.bykv.vk.openvk.component.video.api.r.xt$j r0 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r1 = "hideCloseBtn"
                r2 = 0
                r0.<init>(r1, r2)
                com.bykv.vk.openvk.component.video.api.r.xt.j.j = r0
                com.bykv.vk.openvk.component.video.api.r.xt$j r1 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r3 = "alwayShowBackBtn"
                r4 = 1
                r1.<init>(r3, r4)
                com.bykv.vk.openvk.component.video.api.r.xt.j.xt = r1
                com.bykv.vk.openvk.component.video.api.r.xt$j r3 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r5 = "alwayShowMediaView"
                r6 = 2
                r3.<init>(r5, r6)
                com.bykv.vk.openvk.component.video.api.r.xt.j.cw = r3
                com.bykv.vk.openvk.component.video.api.r.xt$j r5 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r7 = "fixedSize"
                r8 = 3
                r5.<init>(r7, r8)
                com.bykv.vk.openvk.component.video.api.r.xt.j.f1685r = r5
                com.bykv.vk.openvk.component.video.api.r.xt$j r7 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r9 = "hideBackBtn"
                r10 = 4
                r7.<init>(r9, r10)
                com.bykv.vk.openvk.component.video.api.r.xt.j.up = r7
                com.bykv.vk.openvk.component.video.api.r.xt$j r9 = new com.bykv.vk.openvk.component.video.api.r.xt$j
                java.lang.String r11 = "hideTopMoreBtn"
                r12 = 5
                r9.<init>(r11, r12)
                com.bykv.vk.openvk.component.video.api.r.xt.j.f1684m = r9
                r11 = 6
                com.bykv.vk.openvk.component.video.api.r.xt$j[] r11 = new com.bykv.vk.openvk.component.video.api.r.xt.j[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.bykv.vk.openvk.component.video.api.r.xt.j.ae = r11
                return
        }

        j(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bykv.vk.openvk.component.video.api.r.xt.j valueOf(java.lang.String r1) {
                java.lang.Class<com.bykv.vk.openvk.component.video.api.r.xt$j> r0 = com.bykv.vk.openvk.component.video.api.r.xt.j.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bykv.vk.openvk.component.video.api.r.xt$j r1 = (com.bykv.vk.openvk.component.video.api.r.xt.j) r1
                return r1
        }

        public static com.bykv.vk.openvk.component.video.api.r.xt.j[] values() {
                com.bykv.vk.openvk.component.video.api.r.xt$j[] r0 = com.bykv.vk.openvk.component.video.api.r.xt.j.ae
                java.lang.Object r0 = r0.clone()
                com.bykv.vk.openvk.component.video.api.r.xt$j[] r0 = (com.bykv.vk.openvk.component.video.api.r.xt.j[]) r0
                return r0
        }
    }

    android.view.View cw();

    void j();

    void j(int r1);

    void j(android.graphics.drawable.Drawable r1);

    void j(T r1, java.lang.ref.WeakReference<android.content.Context> r2, boolean r3);

    void j(boolean r1);

    void xt();
}
