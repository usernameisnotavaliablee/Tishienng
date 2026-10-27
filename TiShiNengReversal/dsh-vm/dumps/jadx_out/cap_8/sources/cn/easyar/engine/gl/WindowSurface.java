package cn.easyar.engine.gl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WindowSurface extends cn.easyar.engine.gl.EglSurfaceBase {
    private boolean mReleaseSurface;
    private android.view.Surface mSurface;

    public WindowSurface(cn.easyar.engine.gl.EglCore r1, android.graphics.SurfaceTexture r2) {
            r0 = this;
            r0.<init>(r1)
            r0.createWindowSurface(r2)
            return
    }

    public WindowSurface(cn.easyar.engine.gl.EglCore r1, android.view.Surface r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.createWindowSurface(r2)
            r0.mSurface = r2
            r0.mReleaseSurface = r3
            return
    }

    public void recreate(cn.easyar.engine.gl.EglCore r2) {
            r1 = this;
            android.view.Surface r0 = r1.mSurface
            if (r0 == 0) goto La
            r1.mEglCore = r2
            r1.createWindowSurface(r0)
            return
        La:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "not yet implemented for SurfaceTexture"
            r2.<init>(r0)
            throw r2
    }

    public void release() {
            r2 = this;
            r2.releaseEglSurface()
            android.view.Surface r0 = r2.mSurface
            if (r0 == 0) goto L11
            boolean r1 = r2.mReleaseSurface
            if (r1 == 0) goto Le
            r0.release()
        Le:
            r0 = 0
            r2.mSurface = r0
        L11:
            return
    }
}
