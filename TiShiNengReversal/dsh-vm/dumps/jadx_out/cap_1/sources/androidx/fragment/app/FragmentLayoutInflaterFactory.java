package androidx.fragment.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FragmentLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    private static final java.lang.String TAG = "FragmentManager";
    final androidx.fragment.app.FragmentManager mFragmentManager;


    FragmentLayoutInflaterFactory(androidx.fragment.app.FragmentManager r1) {
            r0 = this;
            r0.<init>()
            r0.mFragmentManager = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    @androidx.annotation.Nullable
    public android.view.View onCreateView(@androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.NonNull android.util.AttributeSet r10) {
            r6 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentContainerView r7 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r8 = r6.mFragmentManager
            r7.<init>(r9, r10, r8)
            return r7
        L14:
            java.lang.String r0 = "fragment"
            boolean r8 = r0.equals(r8)
            r0 = 0
            if (r8 != 0) goto L1e
            return r0
        L1e:
            java.lang.String r8 = "class"
            java.lang.String r8 = r10.getAttributeValue(r0, r8)
            int[] r1 = androidx.fragment.R.styleable.Fragment
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r10, r1)
            if (r8 != 0) goto L32
            int r8 = androidx.fragment.R.styleable.Fragment_android_name
            java.lang.String r8 = r1.getString(r8)
        L32:
            int r2 = androidx.fragment.R.styleable.Fragment_android_id
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = androidx.fragment.R.styleable.Fragment_android_tag
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r8 == 0) goto L19e
            java.lang.ClassLoader r1 = r9.getClassLoader()
            boolean r1 = androidx.fragment.app.FragmentFactory.isFragmentClass(r1, r8)
            if (r1 != 0) goto L50
            goto L19e
        L50:
            if (r7 == 0) goto L57
            int r1 = r7.getId()
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 != r3) goto L7d
            if (r2 != r3) goto L7d
            if (r4 == 0) goto L5f
            goto L7d
        L5f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L7d:
            if (r2 == r3) goto L85
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r2)
        L85:
            if (r0 != 0) goto L8f
            if (r4 == 0) goto L8f
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r4)
        L8f:
            if (r0 != 0) goto L99
            if (r1 == r3) goto L99
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
        L99:
            r3 = 2
            r5 = 1
            if (r0 != 0) goto Le6
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.instantiate(r9, r8)
            r0.mFromLayout = r5
            if (r2 == 0) goto Lb1
            r9 = r2
            goto Lb2
        Lb1:
            r9 = r1
        Lb2:
            r0.mFragmentId = r9
            r0.mContainerId = r1
            r0.mTag = r4
            r0.mInLayout = r5
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            r0.mFragmentManager = r9
            androidx.fragment.app.FragmentHostCallback r9 = r9.getHost()
            r0.mHost = r9
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r9 = r9.getHost()
            android.content.Context r9 = r9.getContext()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r9, r10, r1)
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            androidx.fragment.app.FragmentStateManager r9 = r9.addFragment(r0)
            boolean r10 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r10 == 0) goto L117
            r0.toString()
            java.lang.Integer.toHexString(r2)
            goto L117
        Le6:
            boolean r9 = r0.mInLayout
            if (r9 != 0) goto L160
            r0.mInLayout = r5
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            r0.mFragmentManager = r9
            androidx.fragment.app.FragmentHostCallback r9 = r9.getHost()
            r0.mHost = r9
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r9 = r9.getHost()
            android.content.Context r9 = r9.getContext()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r9, r10, r1)
            androidx.fragment.app.FragmentManager r9 = r6.mFragmentManager
            androidx.fragment.app.FragmentStateManager r9 = r9.createOrGetFragmentStateManager(r0)
            boolean r10 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r10 == 0) goto L117
            r0.toString()
            java.lang.Integer.toHexString(r2)
        L117:
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0.mContainer = r7
            r9.moveToExpectedState()
            r9.ensureInflatedView()
            android.view.View r7 = r0.mView
            if (r7 == 0) goto L144
            if (r2 == 0) goto L12a
            r7.setId(r2)
        L12a:
            android.view.View r7 = r0.mView
            java.lang.Object r7 = r7.getTag()
            if (r7 != 0) goto L137
            android.view.View r7 = r0.mView
            r7.setTag(r4)
        L137:
            android.view.View r7 = r0.mView
            androidx.fragment.app.FragmentLayoutInflaterFactory$1 r8 = new androidx.fragment.app.FragmentLayoutInflaterFactory$1
            r8.<init>(r6, r9)
            r7.addOnAttachStateChangeListener(r8)
            android.view.View r7 = r0.mView
            return r7
        L144:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Fragment "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = " did not create a view."
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L160:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": Duplicate id 0x"
            r9.append(r10)
            java.lang.String r10 = java.lang.Integer.toHexString(r2)
            r9.append(r10)
            java.lang.String r10 = ", tag "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ", or parent id 0x"
            r9.append(r10)
            java.lang.String r10 = java.lang.Integer.toHexString(r1)
            r9.append(r10)
            java.lang.String r10 = " with another fragment for "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L19e:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    @androidx.annotation.Nullable
    public android.view.View onCreateView(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
