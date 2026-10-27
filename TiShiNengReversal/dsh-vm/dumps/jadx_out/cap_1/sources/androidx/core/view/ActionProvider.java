package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class ActionProvider {
    private static final java.lang.String TAG = "ActionProvider(support)";
    private final android.content.Context mContext;
    private androidx.core.view.ActionProvider.SubUiVisibilityListener mSubUiVisibilityListener;
    private androidx.core.view.ActionProvider.VisibilityListener mVisibilityListener;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean r1);
    }

    public ActionProvider(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    @androidx.annotation.NonNull
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isVisible() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.NonNull
    public abstract android.view.View onCreateActionView();

    @androidx.annotation.NonNull
    public android.view.View onCreateActionView(@androidx.annotation.NonNull android.view.MenuItem r1) {
            r0 = this;
            android.view.View r1 = r0.onCreateActionView()
            return r1
    }

    public boolean onPerformDefaultAction() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onPrepareSubMenu(@androidx.annotation.NonNull android.view.SubMenu r1) {
            r0 = this;
            return
    }

    public boolean overridesItemVisibility() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void refreshVisibility() {
            r2 = this;
            androidx.core.view.ActionProvider$VisibilityListener r0 = r2.mVisibilityListener
            if (r0 == 0) goto L13
            boolean r0 = r2.overridesItemVisibility()
            if (r0 == 0) goto L13
            androidx.core.view.ActionProvider$VisibilityListener r0 = r2.mVisibilityListener
            boolean r1 = r2.isVisible()
            r0.onActionProviderVisibilityChanged(r1)
        L13:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void reset() {
            r1 = this;
            r0 = 0
            r1.mVisibilityListener = r0
            r1.mSubUiVisibilityListener = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSubUiVisibilityListener(@androidx.annotation.Nullable androidx.core.view.ActionProvider.SubUiVisibilityListener r1) {
            r0 = this;
            r0.mSubUiVisibilityListener = r1
            return
    }

    public void setVisibilityListener(@androidx.annotation.Nullable androidx.core.view.ActionProvider.VisibilityListener r1) {
            r0 = this;
            r0.mVisibilityListener = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void subUiVisibilityChanged(boolean r2) {
            r1 = this;
            androidx.core.view.ActionProvider$SubUiVisibilityListener r0 = r1.mSubUiVisibilityListener
            if (r0 == 0) goto L7
            r0.onSubUiVisibilityChanged(r2)
        L7:
            return
    }
}
