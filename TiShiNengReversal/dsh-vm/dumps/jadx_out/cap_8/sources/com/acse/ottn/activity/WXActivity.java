package com.acse.ottn.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WXActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.EditText a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.EditText f2116b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.activity.WXActivity a;

        public a(com.acse.ottn.activity.WXActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.activity.WXActivity r1 = r0.a
                com.acse.ottn.activity.WXActivity.a(r1)
                return
        }
    }

    static {
            r0 = 9593(0x2579, float:1.3443E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public WXActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.activity.WXActivity r0) {
            r0.a()
            return
    }

    public final void a() {
            r4 = this;
            com.acse.ottn.h0 r0 = com.acse.ottn.h0.a()
            java.lang.String r0 = r0.a(r4)
            r1 = 0
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r4, r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r2 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req
            r2.<init>()
            android.widget.EditText r3 = r4.f2116b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.userName = r3
            android.widget.EditText r3 = r4.a
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.path = r3
            r2.miniprogramType = r1
            r0.sendReq(r2)
            return
    }

    public native void onCreate(android.os.Bundle r1);
}
