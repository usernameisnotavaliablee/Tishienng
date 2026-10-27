package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j1 {
    public j1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r5) {
            java.lang.String r0 = "/"
            java.lang.String r1 = "null_"
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "default_input_method"
            java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r4)     // Catch: java.lang.Throwable -> L29
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L3e
            boolean r4 = r3.contains(r0)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L29
        L27:
            r1 = r0
            goto L3e
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r1 = r3
            goto L3e
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L3e
            r3.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3e
            goto L27
        L3e:
            r2.<init>(r1)
            java.lang.String r0 = "input_method"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L76
            android.view.inputmethod.InputMethodManager r5 = (android.view.inputmethod.InputMethodManager) r5     // Catch: java.lang.Throwable -> L76
            java.util.List r5 = r5.getInputMethodList()     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L76
        L51:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L76
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L76
            android.view.inputmethod.InputMethodInfo r0 = (android.view.inputmethod.InputMethodInfo) r0     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L76
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L51
            int r1 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L76
            if (r1 >= 0) goto L51
            java.lang.String r1 = "[<!>]"
            r2.append(r1)     // Catch: java.lang.Throwable -> L76
            r2.append(r0)     // Catch: java.lang.Throwable -> L76
            goto L51
        L76:
            java.lang.String r5 = r2.toString()
            return r5
    }

    public static java.lang.String b(android.content.Context r6) {
            java.lang.String r0 = "/"
            java.lang.String r1 = "null_"
            if (r6 != 0) goto L8
            r6 = 0
            return r6
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L29
            java.lang.String r5 = "default_input_method"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r5)     // Catch: java.lang.Throwable -> L29
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L29
            if (r5 != 0) goto L3e
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L2b
            java.lang.String[] r0 = r4.split(r0)     // Catch: java.lang.Throwable -> L29
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L29
        L27:
            r1 = r0
            goto L3e
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r1 = r4
            goto L3e
        L2d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            goto L27
        L3e:
            r2.<init>(r1)
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L80
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0     // Catch: java.lang.Throwable -> L80
            java.util.List r0 = r0.getInputMethodList()     // Catch: java.lang.Throwable -> L80
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L80
        L51:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L80
            android.view.inputmethod.InputMethodInfo r1 = (android.view.inputmethod.InputMethodInfo) r1     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L80
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L80
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r3)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.sourceDir     // Catch: java.lang.Throwable -> L80
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L51
            int r1 = r2.indexOf(r1)     // Catch: java.lang.Throwable -> L80
            if (r1 >= 0) goto L51
            java.lang.String r1 = "[<!>]"
            r2.append(r1)     // Catch: java.lang.Throwable -> L80
            r2.append(r4)     // Catch: java.lang.Throwable -> L80
            goto L51
        L80:
            java.lang.String r6 = r2.toString()
            return r6
    }
}
