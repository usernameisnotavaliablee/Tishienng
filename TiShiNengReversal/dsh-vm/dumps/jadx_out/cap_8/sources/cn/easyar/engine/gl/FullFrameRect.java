package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FullFrameRect {
    private cn.easyar.engine.gl.Texture2dProgram mProgram;
    private cn.easyar.engine.gl.Drawable2d mRectDrawable;

    public FullFrameRect(cn.easyar.engine.gl.Texture2dProgram r3) {
            r2 = this;
            r2.<init>()
            cn.easyar.engine.gl.Drawable2d r0 = new cn.easyar.engine.gl.Drawable2d
            cn.easyar.engine.gl.Drawable2d$Prefab r1 = cn.easyar.engine.gl.Drawable2d.Prefab.FULL_RECTANGLE
            r0.<init>(r1)
            r2.mRectDrawable = r0
            r2.mProgram = r3
            return
    }

    public FullFrameRect(cn.easyar.engine.gl.Texture2dProgram r3, android.graphics.RectF r4) {
            r2 = this;
            r2.<init>()
            cn.easyar.engine.gl.Drawable2d r0 = new cn.easyar.engine.gl.Drawable2d
            cn.easyar.engine.gl.Drawable2d$Prefab r1 = cn.easyar.engine.gl.Drawable2d.Prefab.FULL_RECTANGLE
            r0.<init>(r1)
            r2.mRectDrawable = r0
            r2.mProgram = r3
            r0.setCoordsArray(r4)
            return
    }

    public void changeProgram(cn.easyar.engine.gl.Texture2dProgram r2) {
            r1 = this;
            cn.easyar.engine.gl.Texture2dProgram r0 = r1.mProgram
            r0.release()
            r1.mProgram = r2
            return
    }

    public int createTextureObject() {
            r1 = this;
            cn.easyar.engine.gl.Texture2dProgram r0 = r1.mProgram
            int r0 = r0.createTextureObject()
            return r0
    }

    public void drawFrame(int r12, float[] r13) {
            r11 = this;
            cn.easyar.engine.gl.Texture2dProgram r0 = r11.mProgram
            float[] r1 = cn.easyar.engine.gl.GlUtil.IDENTITY_MATRIX
            cn.easyar.engine.gl.Drawable2d r2 = r11.mRectDrawable
            java.nio.FloatBuffer r2 = r2.getVertexArray()
            cn.easyar.engine.gl.Drawable2d r3 = r11.mRectDrawable
            int r4 = r3.getVertexCount()
            cn.easyar.engine.gl.Drawable2d r3 = r11.mRectDrawable
            int r5 = r3.getCoordsPerVertex()
            cn.easyar.engine.gl.Drawable2d r3 = r11.mRectDrawable
            int r6 = r3.getVertexStride()
            cn.easyar.engine.gl.Drawable2d r3 = r11.mRectDrawable
            java.nio.FloatBuffer r8 = r3.getTexCoordArray()
            cn.easyar.engine.gl.Drawable2d r3 = r11.mRectDrawable
            int r10 = r3.getTexCoordStride()
            r3 = 0
            r9 = r12
            r7 = r13
            r0.draw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public cn.easyar.engine.gl.Texture2dProgram getProgram() {
            r1 = this;
            cn.easyar.engine.gl.Texture2dProgram r0 = r1.mProgram
            return r0
    }

    public void release(boolean r2) {
            r1 = this;
            cn.easyar.engine.gl.Texture2dProgram r0 = r1.mProgram
            if (r0 == 0) goto Lc
            if (r2 == 0) goto L9
            r0.release()
        L9:
            r2 = 0
            r1.mProgram = r2
        Lc:
            return
    }
}
