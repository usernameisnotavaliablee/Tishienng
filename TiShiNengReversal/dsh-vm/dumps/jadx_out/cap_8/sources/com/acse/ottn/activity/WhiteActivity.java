package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WhiteActivity extends com.acse.ottn.a0 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f2117e = "ExcessActivity";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.activity.WhiteActivity a;

        public a(com.acse.ottn.activity.WhiteActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.acse.ottn.activity.WhiteActivity r0 = r1.a
                r0.finish()
                return
        }
    }

    static {
            r0 = 9595(0x257b, float:1.3445E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public WhiteActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.acse.ottn.a0
    public native void onCreate(android.os.Bundle r1);
}
