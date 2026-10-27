package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(19)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {
    private static final int INIT_FAILED = 2;
    private static final int INIT_SUCCESS = 1;
    private static final int NOT_INITIALIAZED = 0;
    private static java.lang.reflect.Field sHField;
    private static java.lang.reflect.Field sNextServedViewField;
    private static int sReflectedFieldsInitialized;
    private static java.lang.reflect.Field sServedViewField;
    private android.app.Activity mActivity;

    static {
            return
    }

    ImmLeaksCleaner(android.app.Activity r1) {
            r0 = this;
            r0.<init>()
            r0.mActivity = r1
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    @androidx.annotation.MainThread
    private static void initializeReflectiveFields() {
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            r1 = 2
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r1     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mServedView"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.sServedViewField = r1     // Catch: java.lang.NoSuchFieldException -> L29
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mNextServedView"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.sNextServedViewField = r1     // Catch: java.lang.NoSuchFieldException -> L29
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            java.lang.String r1 = "mH"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.sHField = r0     // Catch: java.lang.NoSuchFieldException -> L29
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L29
            androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized = r2     // Catch: java.lang.NoSuchFieldException -> L29
        L29:
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r3, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L5
            goto L4e
        L5:
            int r3 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            if (r3 != 0) goto Lc
            initializeReflectiveFields()
        Lc:
            int r3 = androidx.activity.ImmLeaksCleaner.sReflectedFieldsInitialized
            r4 = 1
            if (r3 != r4) goto L4e
            android.app.Activity r3 = r2.mActivity
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = androidx.activity.ImmLeaksCleaner.sHField     // Catch: java.lang.IllegalAccessException -> L4e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.IllegalAccessException -> L4e
            if (r4 != 0) goto L24
            goto L4e
        L24:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sServedViewField     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L31 java.lang.ClassCastException -> L48 java.lang.IllegalAccessException -> L4a
            if (r0 != 0) goto L33
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r3 = move-exception
            goto L4c
        L33:
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L3b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            return
        L3b:
            java.lang.reflect.Field r0 = androidx.activity.ImmLeaksCleaner.sNextServedViewField     // Catch: java.lang.Throwable -> L31 java.lang.IllegalAccessException -> L46
            r1 = 0
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalAccessException -> L46
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            r3.isActive()
            return
        L46:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            goto L4e
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            goto L4e
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            goto L4e
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r3
        L4e:
            return
    }
}
