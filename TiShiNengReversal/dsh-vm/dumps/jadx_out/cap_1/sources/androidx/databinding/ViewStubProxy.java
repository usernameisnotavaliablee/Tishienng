package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewStubProxy {
    private androidx.databinding.ViewDataBinding mContainingBinding;
    private android.view.ViewStub.OnInflateListener mOnInflateListener;
    private android.view.ViewStub.OnInflateListener mProxyListener;
    private android.view.View mRoot;
    private androidx.databinding.ViewDataBinding mViewDataBinding;
    private android.view.ViewStub mViewStub;


    public ViewStubProxy(@androidx.annotation.NonNull android.view.ViewStub r2) {
            r1 = this;
            r1.<init>()
            androidx.databinding.ViewStubProxy$1 r0 = new androidx.databinding.ViewStubProxy$1
            r0.<init>(r1)
            r1.mProxyListener = r0
            r1.mViewStub = r2
            r2.setOnInflateListener(r0)
            return
    }

    static /* synthetic */ android.view.View access$002(androidx.databinding.ViewStubProxy r0, android.view.View r1) {
            r0.mRoot = r1
            return r1
    }

    static /* synthetic */ androidx.databinding.ViewDataBinding access$102(androidx.databinding.ViewStubProxy r0, androidx.databinding.ViewDataBinding r1) {
            r0.mViewDataBinding = r1
            return r1
    }

    static /* synthetic */ androidx.databinding.ViewDataBinding access$200(androidx.databinding.ViewStubProxy r0) {
            androidx.databinding.ViewDataBinding r0 = r0.mContainingBinding
            return r0
    }

    static /* synthetic */ android.view.ViewStub access$302(androidx.databinding.ViewStubProxy r0, android.view.ViewStub r1) {
            r0.mViewStub = r1
            return r1
    }

    static /* synthetic */ android.view.ViewStub.OnInflateListener access$400(androidx.databinding.ViewStubProxy r0) {
            android.view.ViewStub$OnInflateListener r0 = r0.mOnInflateListener
            return r0
    }

    static /* synthetic */ android.view.ViewStub.OnInflateListener access$402(androidx.databinding.ViewStubProxy r0, android.view.ViewStub.OnInflateListener r1) {
            r0.mOnInflateListener = r1
            return r1
    }

    @androidx.annotation.Nullable
    public androidx.databinding.ViewDataBinding getBinding() {
            r1 = this;
            androidx.databinding.ViewDataBinding r0 = r1.mViewDataBinding
            return r0
    }

    public android.view.View getRoot() {
            r1 = this;
            android.view.View r0 = r1.mRoot
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.ViewStub getViewStub() {
            r1 = this;
            android.view.ViewStub r0 = r1.mViewStub
            return r0
    }

    public boolean isInflated() {
            r1 = this;
            android.view.View r0 = r1.mRoot
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void setContainingBinding(@androidx.annotation.NonNull androidx.databinding.ViewDataBinding r1) {
            r0 = this;
            r0.mContainingBinding = r1
            return
    }

    public void setOnInflateListener(@androidx.annotation.Nullable android.view.ViewStub.OnInflateListener r2) {
            r1 = this;
            android.view.ViewStub r0 = r1.mViewStub
            if (r0 == 0) goto L6
            r1.mOnInflateListener = r2
        L6:
            return
    }
}
