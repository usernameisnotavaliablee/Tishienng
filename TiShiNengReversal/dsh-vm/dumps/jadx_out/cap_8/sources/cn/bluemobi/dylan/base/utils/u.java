package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class u {
    static android.widget.Toast a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ android.view.View a;

        a(android.view.View r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                android.view.View r2 = r1.a
                r0 = 1
                r2.setEnabled(r0)
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r2) {
                r1 = this;
                android.view.View r2 = r1.a
                r0 = 0
                r2.setEnabled(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends java.util.TimerTask {
        final /* synthetic */ android.widget.EditText a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f144b;

        b(android.widget.EditText r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.f144b = r2
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r3 = this;
                android.widget.EditText r0 = r3.a
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                java.lang.String r1 = r3.f144b
                java.lang.String r2 = "open"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1f
                android.widget.EditText r1 = r3.a
                r2 = 2
                r0.showSoftInput(r1, r2)
                return
            L1f:
                android.widget.EditText r1 = r3.a
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.text.TextWatcher {
        final /* synthetic */ android.widget.EditText a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f145b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.utils.u f146c;

        c(cn.bluemobi.dylan.base.utils.u r1, android.widget.EditText r2, int r3) {
                r0 = this;
                r0.f146c = r1
                r0.a = r2
                r0.f145b = r3
                r0.<init>()
                return
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r7) {
                r6 = this;
                android.widget.EditText r7 = r6.a
                android.text.Editable r7 = r7.getText()
                java.lang.String r7 = r7.toString()
                java.lang.String r0 = "."
                boolean r1 = r7.contains(r0)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L40
                int r1 = r7.length()
                int r1 = r1 - r3
                java.lang.String r4 = r7.toString()
                int r4 = r4.indexOf(r0)
                int r1 = r1 - r4
                int r4 = r6.f145b
                if (r1 <= r4) goto L40
                int r1 = r7.indexOf(r0)
                int r4 = r6.f145b
                int r1 = r1 + r4
                int r1 = r1 + r3
                java.lang.String r7 = r7.substring(r2, r1)
                android.widget.EditText r1 = r6.a
                r1.setText(r7)
                android.widget.EditText r1 = r6.a
                int r4 = r7.length()
                r1.setSelection(r4)
            L40:
                java.lang.String r1 = r7.toString()
                java.lang.String r1 = r1.trim()
                java.lang.String r1 = r1.substring(r2)
                boolean r1 = r1.equals(r0)
                r4 = 2
                java.lang.String r5 = "0"
                if (r1 == 0) goto L6e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                android.widget.EditText r1 = r6.a
                r1.setText(r7)
                android.widget.EditText r1 = r6.a
                r1.setSelection(r4)
            L6e:
                java.lang.String r1 = r7.toString()
                boolean r1 = r1.startsWith(r5)
                if (r1 == 0) goto La2
                java.lang.String r1 = r7.toString()
                java.lang.String r1 = r1.trim()
                int r1 = r1.length()
                if (r1 <= r3) goto La2
                java.lang.String r1 = r7.toString()
                java.lang.String r1 = r1.substring(r3, r4)
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto La2
                android.widget.EditText r0 = r6.a
                java.lang.CharSequence r7 = r7.subSequence(r2, r3)
                r0.setText(r7)
                android.widget.EditText r7 = r6.a
                r7.setSelection(r3)
            La2:
                return
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }
    }

    public u() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String A(android.content.ContentResolver r6, android.net.Uri r7) throws java.io.FileNotFoundException {
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)
            r6.moveToFirst()
            r7 = 1
            java.lang.String r7 = r6.getString(r7)
            r6.close()
            return r7
    }

    public static boolean A0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "[\\u4E00-\\u9FA5]{2,4}"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String B(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "MM月dd日"
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean B0(java.lang.String r3) {
            boolean r0 = T(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            r2 = 6
            if (r0 < r2) goto L21
            java.lang.String r3 = r3.trim()
            int r3 = r3.length()
            r0 = 16
            if (r3 > r0) goto L21
            r3 = 1
            return r3
        L21:
            return r1
    }

    public static java.lang.String C(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "kk:mm:ss"
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean C0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^1[1,2,3,4,5,6,7,8,9]+\\d{9}$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String D(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "MM-dd"
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static int D0(java.lang.String r1) {
            boolean r0 = C0(r1)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            boolean r1 = y0(r1)
            if (r1 == 0) goto L10
            r1 = 2
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static java.lang.String E(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "kk:mm"
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean E0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^(\\d{11})$|^(\\d{3,5}[-]?\\d{6,8})$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String F(long r2) {
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            java.lang.String r0 = "yy-MM-dd HH:mm"
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r0, r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean F0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^[a-zA-Z\\d_]+$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String G(int r3) {
            r0 = 99
            java.lang.String r1 = ""
            if (r3 > r0) goto L3f
            if (r3 != 0) goto L9
            goto L3f
        L9:
            int r0 = r3 % 10
            int r3 = r3 - r0
            int r3 = r3 / 10
            if (r3 == 0) goto L2b
            r1 = 1
            java.lang.String r2 = "十"
            if (r3 != r1) goto L18
            r1 = r2
            goto L2b
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = H(r3)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = H(r0)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L3f:
            return r1
    }

    public static java.lang.String H(int r10) {
            java.lang.String r8 = "八"
            java.lang.String r9 = "九"
            java.lang.String r0 = ""
            java.lang.String r1 = "一"
            java.lang.String r2 = "二"
            java.lang.String r3 = "三"
            java.lang.String r4 = "四"
            java.lang.String r5 = "五"
            java.lang.String r6 = "六"
            java.lang.String r7 = "七"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            r10 = r0[r10]
            return r10
    }

    public static int I(android.content.Context r2, int r3, int r4, int r5) {
            int[] r0 = K(r2)
            r1 = 0
            r0 = r0[r1]
            float r3 = (float) r3
            int r3 = a(r3, r2)
            int r0 = r0 - r3
            float r3 = (float) r4
            int r2 = a(r3, r2)
            int r3 = r5 + (-1)
            int r2 = r2 * r3
            int r0 = r0 - r2
            int r0 = r0 / r5
            return r0
    }

    public static java.lang.String J(long r1) {
            java.lang.String r0 = "yyyyMMddHHmmss"
            java.lang.CharSequence r1 = android.text.format.DateFormat.format(r0, r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static int[] K(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.widthPixels
            int r0 = r0.heightPixels
            int[] r2 = new int[]{r2, r0}
            return r2
    }

    public static java.lang.String L(android.view.View r0) {
            java.lang.Object r0 = r0.getTag()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String M(android.widget.EditText r0) {
            if (r0 == 0) goto Lf
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String N(android.widget.TextView r0) {
            if (r0 == 0) goto Lf
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String O(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L3f
            int r1 = r2.size()
            if (r1 != 0) goto Lb
            goto L3f
        Lb:
            boolean r1 = b0(r3)
            if (r1 == 0) goto L12
            return r0
        L12:
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r2.get(r3)
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L36
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = f0(r1)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L36:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L3f:
            return r0
    }

    public static int P(android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            android.content.pm.PackageInfo r2 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            return r2
        L10:
            return r0
    }

    public static java.lang.String Q(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            java.lang.String r2 = r2.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L10
            return r2
        L10:
            java.lang.String r2 = ""
            return r2
    }

    @android.annotation.SuppressLint({"SimpleDateFormat"})
    public static int R(java.util.Date r1) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            r1 = 3
            int r1 = r0.get(r1)
            return r1
    }

    public static void S(android.app.Activity r2) {
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            android.view.View r2 = r2.getCurrentFocus()
            android.os.IBinder r2 = r2.getWindowToken()
            r1 = 2
            r0.hideSoftInputFromWindow(r2, r1)
            return
    }

    public static boolean T(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "[一-龥]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.find()
            return r1
    }

    public static boolean U(java.lang.String r1) {
            java.lang.String r0 = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    public static boolean V(java.util.List r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.size()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static boolean W(java.lang.Object[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    public static boolean X(java.util.List... r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            boolean r2 = V(r2)
            if (r2 == 0) goto Lf
            r3 = 1
            return r3
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            return r0
    }

    public static boolean Y(java.lang.Object[]... r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            boolean r2 = W(r2)
            if (r2 == 0) goto Lf
            r3 = 1
            return r3
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            return r0
    }

    public static boolean Z(android.widget.EditText r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = M(r0)
            boolean r0 = b0(r0)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static int a(float r2, android.content.Context r3) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getMetrics(r0)
            float r3 = r0.density
            float r2 = r2 * r3
            double r2 = (double) r2
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    public static boolean a0(android.widget.TextView r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = N(r0)
            boolean r0 = b0(r0)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public static void b(android.widget.EditText r2, java.lang.String r3) {
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            cn.bluemobi.dylan.base.utils.u$b r1 = new cn.bluemobi.dylan.base.utils.u$b
            r1.<init>(r2, r3)
            r2 = 300(0x12c, double:1.48E-321)
            r0.schedule(r1, r2)
            return
    }

    public static boolean b0(java.lang.String r1) {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static java.lang.String c(java.util.List r3) {
            java.lang.String r0 = "\\b([\\w\\W])\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = r3.toString()
            int r3 = r3.length()
            r2 = 1
            int r3 = r3 - r2
            java.lang.String r3 = r1.substring(r2, r3)
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r0 = "$1"
            java.lang.String r3 = r3.replaceAll(r0)
            java.lang.String r0 = ","
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replaceAll(r0, r1)
            return r3
    }

    public static boolean c0(java.util.List<java.lang.String> r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r3.get(r1)
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = b0(r2)
            if (r2 == 0) goto L1b
            goto L1e
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            r3 = 1
            return r3
        L20:
            return r0
    }

    public static void d(java.lang.String r0) {
            return
    }

    public static boolean d0(android.widget.TextView... r3) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.length
            if (r1 >= r2) goto L19
            r2 = r3[r1]
            if (r2 == 0) goto L17
            java.lang.String r2 = N(r2)
            boolean r2 = b0(r2)
            if (r2 == 0) goto L14
            goto L17
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            r3 = 1
            return r3
        L19:
            return r0
    }

    public static java.lang.String e(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3) {
            boolean r0 = r2.containsKey(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.get(r3)
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            return r2
        L23:
            return r1
    }

    public static boolean e0(java.lang.String... r4) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto L21
            r2 = r4[r1]
            if (r2 == 0) goto L1f
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            r2 = r4[r1]
            java.lang.String r3 = "null"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L2
        L1f:
            r4 = 1
            return r4
        L21:
            return r0
    }

    public static int[] f(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            int r2 = r0.widthPixels
            int r0 = r0.heightPixels
            int[] r2 = new int[]{r2, r0}
            return r2
    }

    public static boolean f0(java.lang.String r1) {
            if (r1 == 0) goto Ld
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static float g(java.lang.String r0) {
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean g0(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "http://"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static int h(java.lang.String r0) {
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean h0() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void i(android.content.Context r0, int r1) {
            if (r0 == 0) goto L9
            java.lang.String r1 = r0.getString(r1)
            j(r0, r1)
        L9:
            return
    }

    public static boolean i0(java.lang.String r0, java.lang.String r1) {
            if (r0 == 0) goto La
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public static void j(android.content.Context r1, java.lang.String r2) {
            if (r2 == 0) goto La
            r0 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
        La:
            return
    }

    public static void j0(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto Le
            r0.mkdir()
        Le:
            return
    }

    public static java.lang.String k(java.lang.String r4) {
            if (r4 == 0) goto L29
            int r0 = r4.length()
            r1 = 4
            if (r0 == r1) goto La
            goto L29
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 0
            r3 = 2
            java.lang.String r2 = r4.substring(r2, r3)
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.lang.String r4 = r4.substring(r3, r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L29:
            r4 = 0
            return r4
    }

    public static java.lang.String k0(long r12) {
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
            r0 = 1
        Lc:
            long r12 = java.lang.Math.abs(r12)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r4
            r4 = 60
            long r6 = r12 % r4
            int r7 = (int) r6
            long r12 = r12 / r4
            long r8 = r12 % r4
            int r6 = (int) r8
            long r12 = r12 / r4
            int r4 = (int) r12
            java.util.Locale r5 = java.util.Locale.US
            java.text.NumberFormat r5 = java.text.NumberFormat.getInstance(r5)
            java.text.DecimalFormat r5 = (java.text.DecimalFormat) r5
            java.lang.String r8 = "00"
            r5.applyPattern(r8)
            java.lang.String r8 = ""
            java.lang.String r9 = "-"
            java.lang.String r10 = ":"
            int r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r11 <= 0) goto La5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r0 == 0) goto L3d
            r8 = r9
        L3d:
            r12.append(r8)
            java.lang.String r13 = "0"
            r0 = 10
            if (r4 != 0) goto L48
            r2 = r1
            goto L5e
        L48:
            if (r4 >= r0) goto L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L5e
        L5a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
        L5e:
            r12.append(r2)
            r12.append(r10)
            if (r6 != 0) goto L68
            r2 = r1
            goto L7e
        L68:
            if (r6 >= r0) goto L7a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            goto L7e
        L7a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L7e:
            r12.append(r2)
            r12.append(r10)
            if (r7 != 0) goto L87
            goto L9d
        L87:
            if (r7 >= r0) goto L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r7)
            java.lang.String r1 = r0.toString()
            goto L9d
        L99:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L9d:
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            return r12
        La5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            if (r0 == 0) goto Lad
            r8 = r9
        Lad:
            r12.append(r8)
            r12.append(r6)
            r12.append(r10)
            long r0 = (long) r7
            java.lang.String r13 = r5.format(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
    }

    public static java.lang.String l(android.graphics.Bitmap r4) {
            r0 = 0
            if (r4 == 0) goto L3c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r1.flush()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r1.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            java.lang.String r0 = cn.bluemobi.dylan.base.utils.b.b(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r4 = r0
            r0 = r1
            goto L3d
        L20:
            r4 = move-exception
            r0 = r1
            goto L2a
        L23:
            goto L33
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r1 = r0
            goto L33
        L2a:
            if (r0 == 0) goto L32
            r0.flush()     // Catch: java.io.IOException -> L32
            r0.close()     // Catch: java.io.IOException -> L32
        L32:
            throw r4
        L33:
            if (r1 == 0) goto L46
            r1.flush()     // Catch: java.io.IOException -> L46
            r1.close()     // Catch: java.io.IOException -> L46
            goto L46
        L3c:
            r4 = r0
        L3d:
            if (r0 == 0) goto L45
            r0.flush()     // Catch: java.io.IOException -> L45
            r0.close()     // Catch: java.io.IOException -> L45
        L45:
            r0 = r4
        L46:
            return r0
    }

    public static java.lang.Double l0(double r3, int r5) {
            if (r5 < 0) goto L2f
            r0 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L10
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.lang.String r4 = "0.0"
            r3.<init>(r4)
            goto L1a
        L10:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r3 = java.lang.Double.toString(r3)
            r0.<init>(r3)
            r3 = r0
        L1a:
            java.math.BigDecimal r4 = new java.math.BigDecimal
            java.lang.String r0 = "1"
            r4.<init>(r0)
            r0 = 4
            java.math.BigDecimal r3 = r3.divide(r4, r5, r0)
            double r3 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
        L2f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The scale must be a positive integer or zero"
            r3.<init>(r4)
            throw r3
    }

    public static java.util.Date m(java.util.Date r1, int r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            r1 = 6
            r0.add(r1, r2)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    public static android.graphics.Bitmap m0(android.graphics.Bitmap r3, int r4, int r5) {
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            float r2 = (float) r4
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = (float) r5
            float r1 = (float) r1
            float r0 = r0 / r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.postScale(r2, r0)
            r0 = 0
            r1.postRotate(r0)
            r0 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r5, r0)
            return r3
    }

    public static java.lang.String n(int r0) {
            switch(r0) {
                case 1: goto L1e;
                case 2: goto L1a;
                case 3: goto L16;
                case 4: goto L12;
                case 5: goto Le;
                case 6: goto La;
                case 7: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            return r0
        L6:
            java.lang.String r0 = "星期日"
            return r0
        La:
            java.lang.String r0 = "星期六"
            return r0
        Le:
            java.lang.String r0 = "星期五"
            return r0
        L12:
            java.lang.String r0 = "星期四"
            return r0
        L16:
            java.lang.String r0 = "星期三"
            return r0
        L1a:
            java.lang.String r0 = "星期二"
            return r0
        L1e:
            java.lang.String r0 = "星期一"
            return r0
    }

    public static android.text.Spanned n0(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<font color=#000>"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "</font>"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)
            return r2
    }

    public static android.graphics.Bitmap o(android.graphics.Bitmap r3) {
            if (r3 == 0) goto L1c
            int r0 = r3.getWidth()     // Catch: java.lang.Exception -> L1c
            int r1 = r3.getHeight()     // Catch: java.lang.Exception -> L1c
            r2 = 0
            if (r0 <= r1) goto L15
            int r0 = r0 - r1
            int r0 = r0 / 2
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r0, r2, r1, r1)     // Catch: java.lang.Exception -> L1c
            return r3
        L15:
            int r1 = r1 - r0
            int r1 = r1 / 2
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r2, r1, r0, r0)     // Catch: java.lang.Exception -> L1c
        L1c:
            return r3
    }

    public static java.lang.String p(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = ":"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static void p0(android.content.Context r1, java.lang.CharSequence r2, int r3) {
            android.widget.Toast r0 = cn.bluemobi.dylan.base.utils.u.a
            if (r0 != 0) goto Lb
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            cn.bluemobi.dylan.base.utils.u.a = r1
            goto Le
        Lb:
            r0.setText(r2)
        Le:
            android.widget.Toast r1 = cn.bluemobi.dylan.base.utils.u.a
            r1.show()
            return
    }

    public static boolean q() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void q0(android.view.View r2) {
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r1 = 2
            r0.showSoftInput(r2, r1)
            return
    }

    @android.annotation.SuppressLint({"SimpleDateFormat"})
    public static java.lang.String r(java.lang.String r2) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MM-dd HH:mm"
            r0.<init>(r1)
            java.util.Date r1 = r0.parse(r2)     // Catch: java.text.ParseException -> Lf
            java.lang.String r2 = r0.format(r1)     // Catch: java.text.ParseException -> Lf
        Lf:
            return r2
    }

    public static void r0(android.view.View r10, android.widget.ImageView r11, int r12, int r13, boolean r14) {
            if (r14 == 0) goto L6
            r11.setBackgroundResource(r13)
            goto L9
        L6:
            r11.setBackgroundResource(r12)
        L9:
            android.view.animation.AnimationSet r12 = new android.view.animation.AnimationSet
            r13 = 1
            r12.<init>(r13)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1067030938(0x3f99999a, float:1.2)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.view.animation.ScaleAnimation r1 = new android.view.animation.ScaleAnimation
            r8 = 1
            r9 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r7 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.setStartOffset(r2)
            r2 = 50
            r0.setDuration(r2)
            r1.setStartOffset(r2)
            r1.setDuration(r2)
            r12.addAnimation(r0)
            r12.addAnimation(r1)
            r12.setFillAfter(r13)
            r11.startAnimation(r12)
            cn.bluemobi.dylan.base.utils.u$a r11 = new cn.bluemobi.dylan.base.utils.u$a
            r11.<init>(r10)
            r12.setAnimationListener(r11)
            return
    }

    public static java.lang.String s(java.lang.Object r1) {
            java.lang.String r0 = "yyyy-MM-dd"
            java.lang.String r1 = t(r1, r0)
            return r1
    }

    public static android.graphics.Bitmap s0(android.graphics.Bitmap r1) {
            if (r1 == 0) goto L10
            android.graphics.Bitmap r1 = o(r1)
            int r0 = r1.getWidth()
            int r0 = r0 / 2
            android.graphics.Bitmap r1 = t0(r1, r0)
        L10:
            return r1
    }

    @android.annotation.SuppressLint({"SimpleDateFormat"})
    public static java.lang.String t(java.lang.Object r5, java.lang.String r6) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L1b
            r0.<init>(r6)     // Catch: java.lang.Exception -> L1b
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Exception -> L1b
            java.lang.String r5 = w(r5)     // Catch: java.lang.Exception -> L1b
            long r1 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L1b
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r6.<init>(r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r5 = r0.format(r6)     // Catch: java.lang.Exception -> L1b
            return r5
        L1b:
            java.lang.String r5 = ""
            return r5
    }

    public static android.graphics.Bitmap t0(android.graphics.Bitmap r7, int r8) {
            if (r7 == 0) goto L4c
            int r0 = r7.getWidth()     // Catch: java.lang.Exception -> L4c
            int r1 = r7.getHeight()     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L4c
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch: java.lang.Exception -> L4c
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L4c
            r1.<init>(r0)     // Catch: java.lang.Exception -> L4c
            android.graphics.Paint r2 = new android.graphics.Paint     // Catch: java.lang.Exception -> L4c
            r2.<init>()     // Catch: java.lang.Exception -> L4c
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch: java.lang.Exception -> L4c
            int r4 = r7.getWidth()     // Catch: java.lang.Exception -> L4c
            int r5 = r7.getHeight()     // Catch: java.lang.Exception -> L4c
            r6 = 0
            r3.<init>(r6, r6, r4, r5)     // Catch: java.lang.Exception -> L4c
            android.graphics.RectF r4 = new android.graphics.RectF     // Catch: java.lang.Exception -> L4c
            r4.<init>(r3)     // Catch: java.lang.Exception -> L4c
            float r8 = (float) r8     // Catch: java.lang.Exception -> L4c
            r5 = 1
            r2.setAntiAlias(r5)     // Catch: java.lang.Exception -> L4c
            r1.drawARGB(r6, r6, r6, r6)     // Catch: java.lang.Exception -> L4c
            r5 = -12434878(0xffffffffff424242, float:-2.5821426E38)
            r2.setColor(r5)     // Catch: java.lang.Exception -> L4c
            r1.drawRoundRect(r4, r8, r8, r2)     // Catch: java.lang.Exception -> L4c
            android.graphics.PorterDuffXfermode r8 = new android.graphics.PorterDuffXfermode     // Catch: java.lang.Exception -> L4c
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch: java.lang.Exception -> L4c
            r8.<init>(r4)     // Catch: java.lang.Exception -> L4c
            r2.setXfermode(r8)     // Catch: java.lang.Exception -> L4c
            r1.drawBitmap(r7, r3, r3, r2)     // Catch: java.lang.Exception -> L4c
            return r0
        L4c:
            return r7
    }

    public static java.lang.String u(java.lang.Object r1) {
            java.lang.String r1 = w(r1)
            int r0 = r1.length()
            if (r0 != 0) goto Lc
            java.lang.String r1 = "0.00"
        Lc:
            return r1
    }

    public static java.lang.String u0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 != 0) goto Lb
            java.lang.String r1 = r1.trim()
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String v(java.lang.String r6) {
            java.lang.String r0 = "."
            boolean r1 = r6.contains(r0)
            java.lang.String r2 = ".00"
            if (r1 == 0) goto L56
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r3 = 1
            r4 = r1[r3]
            int r4 = r4.length()
            r5 = 0
            if (r4 != 0) goto L2c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r0 = r1[r5]
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            return r6
        L2c:
            r2 = r1[r3]
            int r2 = r2.length()
            if (r2 != r3) goto L50
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r2 = r1[r5]
            r6.append(r2)
            r6.append(r0)
            r0 = r1[r3]
            r6.append(r0)
            java.lang.String r0 = "0"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
        L50:
            r0 = r1[r3]
            r0.length()
            return r6
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static boolean v0(java.lang.String r1) {
            java.lang.String r0 = "/^([a-z0-9\\-_.+]+)@([a-z0-9\\-]+[.][a-z0-9\\-.]+)$/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    public static java.lang.String w(java.lang.Object r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L11
            boolean r1 = b0(r1)     // Catch: java.lang.Exception -> L11
            if (r1 != 0) goto L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            return r0
    }

    public static boolean w0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^\\d{13,19}$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String x(java.lang.Object r1) {
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r1 = t(r1, r0)
            return r1
    }

    public static boolean x0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^\\d{6}$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.String[]> y(double r7, int r9, double r10, double r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            double r12 = r10 - r12
            int r1 = r9 + (-1)
            double r1 = (double) r1
            double r12 = r12 / r1
            r1 = 0
        Lc:
            if (r1 >= r9) goto L56
            double r2 = (double) r1
            double r2 = r2 * r12
            double r2 = r10 - r2
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r2 * r4
            r4 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r2 = r2 / r4
            double r4 = java.lang.Math.cos(r2)
            double r4 = r4 * r7
            double r2 = java.lang.Math.sin(r2)
            double r2 = r2 * r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ""
            r6.append(r4)
            java.lang.String r5 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            java.lang.String[] r2 = new java.lang.String[]{r5, r2}
            r0.add(r2)
            int r1 = r1 + 1
            goto Lc
        L56:
            return r0
    }

    public static boolean y0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public static java.lang.String z(android.content.ContentResolver r2, android.net.Uri r3) {
            java.lang.String r0 = r3.getScheme()     // Catch: java.io.FileNotFoundException -> L16
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)     // Catch: java.io.FileNotFoundException -> L16
            if (r0 == 0) goto L11
            java.lang.String r2 = r3.getPath()     // Catch: java.io.FileNotFoundException -> L16
            return r2
        L11:
            java.lang.String r2 = A(r2, r3)     // Catch: java.io.FileNotFoundException -> L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static boolean z0(java.lang.String r1) {
            boolean r0 = b0(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^[0-9]{17}[0-9|xX]{1}$"
            boolean r1 = r1.matches(r0)
            return r1
    }

    public void o0(android.widget.EditText r2, int r3) {
            r1 = this;
            cn.bluemobi.dylan.base.utils.u$c r0 = new cn.bluemobi.dylan.base.utils.u$c
            r0.<init>(r1, r2, r3)
            r2.addTextChangedListener(r0)
            return
    }
}
