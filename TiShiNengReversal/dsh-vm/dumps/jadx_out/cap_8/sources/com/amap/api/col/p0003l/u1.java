package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class u1 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4000b;

    /* renamed from: c, reason: collision with root package name */
    public int f4001c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4002d;

    public u1() {
            r1 = this;
            r1.<init>()
            return
    }

    public final void a() {
            r1 = this;
            int r0 = r1.a
            if (r0 < 0) goto L7
            android.opengl.GLES20.glDeleteProgram(r0)
        L7:
            int r0 = r1.f4000b
            if (r0 < 0) goto Le
            android.opengl.GLES20.glDeleteShader(r0)
        Le:
            int r0 = r1.f4001c
            if (r0 < 0) goto L15
            android.opengl.GLES20.glDeleteShader(r0)
        L15:
            r0 = 1
            r1.f4002d = r0
            return
    }
}
