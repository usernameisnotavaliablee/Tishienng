package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class z {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float a;

        public a(float r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r7, android.graphics.Outline r8) {
                r6 = this;
                int r3 = r7.getWidth()
                int r4 = r7.getHeight()
                float r5 = r6.a
                r1 = 0
                r2 = 0
                r0 = r8
                r0.setRoundRect(r1, r2, r3, r4, r5)
                return
        }
    }

    public z() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float a(float r2) {
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1
            float r2 = android.util.TypedValue.applyDimension(r1, r2, r0)
            return r2
    }

    public static int a(boolean r0, int r1, int r2) {
            if (r0 != 0) goto L3
            return r1
        L3:
            if (r1 != 0) goto L8
            int r2 = r2 + (-1)
            return r2
        L8:
            int r2 = r2 + 1
            if (r1 != r2) goto Le
            r0 = 0
            return r0
        Le:
            int r1 = r1 + (-1)
            return r1
    }

    public static android.view.View a(@androidx.annotation.NonNull android.view.ViewGroup r2, @androidx.annotation.LayoutRes int r3) {
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r2 = r0.inflate(r3, r2, r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            int r0 = r3.height
            r1 = -1
            if (r0 != r1) goto L1c
            int r0 = r3.width
            if (r0 == r1) goto L1b
            goto L1c
        L1b:
            return r2
        L1c:
            r3.height = r1
            r3.width = r1
            r2.setLayoutParams(r3)
            return r2
    }

    @androidx.annotation.RequiresApi(api = 21)
    public static void a(android.view.View r1, float r2) {
            com.acse.ottn.z$a r0 = new com.acse.ottn.z$a
            r0.<init>(r2)
            r1.setOutlineProvider(r0)
            r2 = 1
            r1.setClipToOutline(r2)
            return
    }
}
