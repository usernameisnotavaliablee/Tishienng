package com.bytedance.pangle.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j implements android.view.View.OnClickListener {
    private final int cw;
    private final android.app.Activity j;
    private java.lang.reflect.Method r;
    private final java.lang.String xt;

    public j(@androidx.annotation.NonNull android.app.Activity r1, int r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r3
            r0.cw = r2
            return
    }

    @androidx.annotation.NonNull
    private void j(@androidx.annotation.Nullable android.app.Activity r4, @androidx.annotation.NonNull java.lang.String r5) {
            r3 = this;
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.String r5 = r3.xt     // Catch: java.lang.NoSuchMethodException -> L17
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Method r4 = r4.getMethod(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L17
            if (r4 == 0) goto L17
            r3.r = r4     // Catch: java.lang.NoSuchMethodException -> L17
            return
        L17:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find method "
            r5.<init>(r0)
            java.lang.String r0 = r3.xt
            r5.append(r0)
            java.lang.String r0 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
            r5.append(r0)
            int r0 = r3.cw
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@androidx.annotation.NonNull android.view.View r5) {
            r4 = this;
            java.lang.reflect.Method r0 = r4.r
            if (r0 != 0) goto Lb
            android.app.Activity r0 = r4.j
            java.lang.String r1 = r4.xt
            r4.j(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r4.r     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            android.app.Activity r1 = r4.j     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1b
            return
        L19:
            r5 = move-exception
            goto L1d
        L1b:
            r5 = move-exception
            goto L25
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not execute method for android:onClick"
            r0.<init>(r1, r5)
            throw r0
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not execute non-public method for android:onClick"
            r0.<init>(r1, r5)
            throw r0
    }
}
