package cn.bluemobi.dylan.uncaughtexception.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DefaultErrorActivity extends android.app.Activity {
    private android.view.View a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ java.lang.Class a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity f234b;

        a(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r1, java.lang.Class r2) {
                r0 = this;
                r0.f234b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.content.Intent r3 = new android.content.Intent
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r2.f234b
                java.lang.Class r1 = r2.a
                r3.<init>(r0, r1)
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r2.f234b
                cn.bluemobi.dylan.uncaughtexception.a.Y(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity a;

        b(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r1 = r0.a
                cn.bluemobi.dylan.uncaughtexception.a.u(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnClickListener {
        final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.content.DialogInterface.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c a;

            a(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r2, int r3) {
                    r1 = this;
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r2 = r1.a
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r2 = r2.a
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.a(r2)
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r2 = r1.a
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r2 = r2.a
                    int r3 = cat.ereza.customactivityoncrash.R.string.customactivityoncrash_error_activity_error_details_copied
                    r0 = 0
                    android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
                    r2.show()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class b implements android.content.DialogInterface.OnClickListener {
            final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            class a extends java.lang.Thread {
                final /* synthetic */ cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c.b a;

                a(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c.b r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                        r4 = this;
                        super.run()
                        java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.D()
                        boolean r0 = android.text.TextUtils.isEmpty(r0)
                        if (r0 != 0) goto L3f
                        java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.D()
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "{ \"msgtype\": \"text\", \"text\": {\"content\": \""
                        r1.append(r2)
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b r2 = r4.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r2 = r2.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r2 = r2.a
                        android.content.Intent r3 = r2.getIntent()
                        java.lang.String r2 = cn.bluemobi.dylan.uncaughtexception.a.w(r2, r3)
                        r1.append(r2)
                        java.lang.String r2 = "\"}}"
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b r2 = r4.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r2 = r2.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r2 = r2.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.b(r2, r0, r1)
                    L3f:
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b r0 = r4.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r0 = r0.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r0.a
                        java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.y(r0)
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b r1 = r4.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c r1 = r1.a
                        cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r1 = r1.a
                        android.content.Intent r2 = r1.getIntent()
                        java.lang.String r1 = cn.bluemobi.dylan.uncaughtexception.a.w(r1, r2)
                        j.b.a(r0, r1)
                        return
                }
            }

            b(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface r1, int r2) {
                    r0 = this;
                    cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b$a r1 = new cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b$a
                    r1.<init>(r0)
                    r1.start()
                    return
            }
        }

        c(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r2.a
                r3.<init>(r0)
                int r0 = cat.ereza.customactivityoncrash.R.string.customactivityoncrash_error_activity_error_details_title
                android.app.AlertDialog$Builder r3 = r3.setTitle(r0)
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r2.a
                android.content.Intent r1 = r0.getIntent()
                java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.w(r0, r1)
                android.app.AlertDialog$Builder r3 = r3.setMessage(r0)
                int r0 = cat.ereza.customactivityoncrash.R.string.customactivityoncrash_error_activity_error_details_close
                r1 = 0
                android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r0, r1)
                int r0 = cat.ereza.customactivityoncrash.R.string.report_to_developer
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b r1 = new cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$b
                r1.<init>(r2)
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r0, r1)
                int r0 = cat.ereza.customactivityoncrash.R.string.customactivityoncrash_error_activity_error_details_copy
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$a r1 = new cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity$c$a
                r1.<init>(r2)
                android.app.AlertDialog$Builder r3 = r3.setNeutralButton(r0, r1)
                android.app.AlertDialog r3 = r3.show()
                r0 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r3 = r3.findViewById(r0)
                android.widget.TextView r3 = (android.widget.TextView) r3
                cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0 = r2.a
                android.content.res.Resources r0 = r0.getResources()
                int r1 = cat.ereza.customactivityoncrash.R.dimen.customactivityoncrash_error_activity_error_details_text_size
                float r0 = r0.getDimension(r1)
                r1 = 0
                r3.setTextSize(r1, r0)
                return
        }
    }

    static {
            r0 = 7622(0x1dc6, float:1.068E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public DefaultErrorActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void a(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0) {
            r0.c()
            return
    }

    static /* synthetic */ void b(cn.bluemobi.dylan.uncaughtexception.activity.DefaultErrorActivity r0, java.lang.String r1, java.lang.String r2) {
            r0.e(r1, r2)
            return
    }

    private void c() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = cn.bluemobi.dylan.uncaughtexception.a.w(r3, r0)
            java.lang.String r1 = "clipboard"
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            int r2 = cat.ereza.customactivityoncrash.R.string.customactivityoncrash_error_activity_error_details_clipboard_label
            java.lang.String r2 = r3.getString(r2)
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r0)
            r1.setPrimaryClip(r0)
            return
    }

    private void e(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r0.getClass()     // Catch: java.lang.Exception -> L68
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L68
            r0.<init>(r3)     // Catch: java.lang.Exception -> L68
            java.net.URLConnection r3 = r0.openConnection()     // Catch: java.lang.Exception -> L68
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Exception -> L68
            r0 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L68
            r3.setReadTimeout(r0)     // Catch: java.lang.Exception -> L68
            r0 = 1
            r3.setDoOutput(r0)     // Catch: java.lang.Exception -> L68
            r3.setDoInput(r0)     // Catch: java.lang.Exception -> L68
            r1 = 0
            r3.setUseCaches(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = "POST"
            r3.setRequestMethod(r1)     // Catch: java.lang.Exception -> L68
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r3.setRequestProperty(r0, r1)     // Catch: java.lang.Exception -> L68
            r3.connect()     // Catch: java.lang.Exception -> L68
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.lang.Exception -> L68
            java.io.OutputStream r1 = r3.getOutputStream()     // Catch: java.lang.Exception -> L68
            r0.<init>(r1)     // Catch: java.lang.Exception -> L68
            byte[] r4 = r4.getBytes()     // Catch: java.lang.Exception -> L68
            r0.write(r4)     // Catch: java.lang.Exception -> L68
            r0.flush()     // Catch: java.lang.Exception -> L68
            r0.close()     // Catch: java.lang.Exception -> L68
            int r4 = r3.getResponseCode()     // Catch: java.lang.Exception -> L68
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L60
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.lang.Exception -> L68
            r2.f(r4)     // Catch: java.lang.Exception -> L68
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r4.getClass()     // Catch: java.lang.Exception -> L68
            goto L65
        L60:
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Exception -> L68
            r4.getClass()     // Catch: java.lang.Exception -> L68
        L65:
            r3.disconnect()     // Catch: java.lang.Exception -> L68
        L68:
            return
    }

    protected android.app.AlertDialog.Builder d(android.content.Context r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getLayoutInflater()
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r4)
            int r4 = cat.ereza.customactivityoncrash.R.layout.customview
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r2)
            r3.a = r4
            android.app.AlertDialog$Builder r4 = r1.setView(r4)
            return r4
    }

    public java.lang.String f(java.io.InputStream r5) {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L25
        L9:
            int r2 = r5.read(r1)     // Catch: java.lang.Exception -> L25
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Exception -> L25
            goto L9
        L15:
            r0.close()     // Catch: java.lang.Exception -> L25
            r5.close()     // Catch: java.lang.Exception -> L25
            byte[] r5 = r0.toByteArray()     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L25
            r0.<init>(r5)     // Catch: java.lang.Exception -> L25
            return r0
        L25:
            r5 = 0
            return r5
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);
}
