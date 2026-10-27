package com.bxkj.student.generated.callback;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements android.view.View.OnClickListener {
    final com.bxkj.student.generated.callback.a.InterfaceC0073a a;
    final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0073a {
        void _internalCallbackOnClick(int r1, android.view.View r2);
    }

    public a(com.bxkj.student.generated.callback.a.InterfaceC0073a r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            com.bxkj.student.generated.callback.a$a r0 = r2.a
            int r1 = r2.b
            r0._internalCallbackOnClick(r1, r3)
            return
    }
}
