package xyz.adscope.ad.widget.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPAdActivity extends android.app.Activity {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private android.widget.RelativeLayout e;

    static {
            r0 = 55668(0xd974, float:7.8007E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ASNPAdActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private /* synthetic */ void a(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0 = this;
            boolean r2 = r1 instanceof android.widget.RelativeLayout
            if (r2 == 0) goto L12
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r1 = r1.getChildCount()
            if (r1 > 0) goto L12
            r1 = 0
            java.lang.String r2 = ""
            r0.a(r1, r2)
        L12:
            return
    }

    private void a(java.lang.String r3) {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "Result"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "com.asnp.ad.ACTION_ACTIVITY_RESULT"
            r0.setAction(r3)
            android.content.Context r3 = r2.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r3 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            r3.sendBroadcast(r0)
            return
    }

    public static /* synthetic */ void a(xyz.adscope.ad.widget.activity.ASNPAdActivity r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void a(boolean r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "广告Activity异常..."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ASNPAdActivity"
            xyz.adscope.common.v2.log.SDKLog.e(r1, r0)
            if (r3 == 0) goto L1b
            r2.a(r4)
        L1b:
            r2.finish()
            return
    }

    private boolean a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L14
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L14
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    protected void a() {
            r3 = this;
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r3)
            r3.e = r0
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r3.addContentView(r0, r1)
            android.widget.RelativeLayout r0 = r3.e
            xyz.adscope.ad.widget.activity.a r1 = new xyz.adscope.ad.widget.activity.a
            r1.<init>(r3)
            r0.addOnLayoutChangeListener(r1)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 0
            r1.e = r0
            return
    }
}
