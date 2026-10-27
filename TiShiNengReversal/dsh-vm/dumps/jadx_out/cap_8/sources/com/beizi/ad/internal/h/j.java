package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.graphics.Bitmap a(android.content.Context r3, android.graphics.Bitmap r4, float r5) {
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            r2 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r0, r1, r2)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4)
            android.renderscript.RenderScript r3 = android.renderscript.RenderScript.create(r3)
            android.renderscript.Element r1 = android.renderscript.Element.U8_4(r3)
            android.renderscript.ScriptIntrinsicBlur r1 = android.renderscript.ScriptIntrinsicBlur.create(r3, r1)
            android.renderscript.Allocation r4 = android.renderscript.Allocation.createFromBitmap(r3, r4)
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createFromBitmap(r3, r0)
            r1.setRadius(r5)
            r1.setInput(r4)
            r1.forEach(r3)
            r3.copyTo(r0)
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            java.lang.String r1 = "#05000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r4.drawColor(r1)
            int r4 = r0.getWidth()
            int r1 = r0.getHeight()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r1, r5)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r1 = 0
            r2 = 0
            r5.drawBitmap(r0, r1, r1, r2)
            r5.drawBitmap(r3, r1, r1, r2)
            return r4
    }
}
