package cn.jpush.android.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {


    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static cn.jpush.android.d.d a(android.content.Context r15, cn.jpush.android.d.d r16) {
            r6 = r16
            java.lang.String r1 = r6.bi     // Catch: java.lang.Throwable -> L1fa
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1fa
            if (r2 == 0) goto L10
            java.lang.String r1 = r6.bj     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r1 = cn.jpush.android.ad.a.d(r1)     // Catch: java.lang.Throwable -> L1fa
        L10:
            r7 = r1
            java.lang.String r8 = r6.f1757d     // Catch: java.lang.Throwable -> L1fa
            java.util.LinkedHashMap r9 = a(r15)     // Catch: java.lang.Throwable -> L1fa
            java.lang.Object r1 = r9.get(r7)     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.t.b r1 = (cn.jpush.android.t.b) r1     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r10 = "file://"
            java.lang.String r11 = ""
            java.lang.String r12 = "InAppTplHelper"
            if (r1 == 0) goto L91
            java.lang.String r2 = r1.f1910b     // Catch: java.lang.Throwable -> L1fa
            boolean r3 = cn.jpush.android.ad.c.a(r2)     // Catch: java.lang.Throwable -> L1fa
            if (r3 == 0) goto L84
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            r3.append(r10)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            r6.be = r3     // Catch: java.lang.Throwable -> L1fa
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1fa
            r1.f1911c = r3     // Catch: java.lang.Throwable -> L1fa
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1fa
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1fa
            long r4 = r1.f1911c     // Catch: java.lang.Throwable -> L1fa
            boolean r1 = r3.setLastModified(r4)     // Catch: java.lang.Throwable -> L1fa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = "use cache template, templateId: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r7)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = ", webPagePath: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = ", totalTemplateCount: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            java.util.Collection r4 = r9.values()     // Catch: java.lang.Throwable -> L1fa
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L1fa
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = ", update template file time: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r1)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.d(r12, r1)     // Catch: java.lang.Throwable -> L1fa
            goto L8d
        L84:
            r9.remove(r7)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r1 = "local config has template path, but the template file is not exist, will download again."
            cn.jpush.android.helper.Logger.d(r12, r1)     // Catch: java.lang.Throwable -> L1fa
            r2 = r11
        L8d:
            a(r15, r9)     // Catch: java.lang.Throwable -> L1fa
            goto L92
        L91:
            r2 = r11
        L92:
            java.lang.String r1 = r6.bj     // Catch: java.lang.Throwable -> L1fa
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1fa
            r13 = 0
            r14 = 0
            if (r2 == 0) goto L151
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r2.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = "no local template cache, start download template, url: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1fa
            r2.append(r1)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.d(r12, r2)     // Catch: java.lang.Throwable -> L1fa
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L1fa
            if (r2 != 0) goto Lca
            java.lang.String r2 = "inapp_tpl"
            r3 = 5
            r4 = 5000(0x1388, double:2.4703E-320)
            r0 = r15
            java.lang.String r2 = cn.jpush.android.w.b.a(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1fa
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1fa
            if (r3 != 0) goto Lc7
            r11 = r2
        Lc7:
            r2 = r3 ^ 1
            goto Ld0
        Lca:
            java.lang.String r2 = "template url is Empty! Give up to download!"
            cn.jpush.android.helper.Logger.w(r12, r2)     // Catch: java.lang.Throwable -> L1fa
            r2 = 0
        Ld0:
            if (r2 == 0) goto L14b
            java.lang.String r2 = "h5_tpls"
            r3 = 20
            java.lang.String r2 = cn.jpush.android.ad.c.a(r15, r2, r3)     // Catch: java.lang.Throwable -> L1fa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r7)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = ".html"
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = "download template success, will save to local of path: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.d(r12, r3)     // Catch: java.lang.Throwable -> L1fa
            boolean r3 = cn.jpush.android.ad.c.b(r2, r11)     // Catch: java.lang.Throwable -> L1fa
            if (r3 == 0) goto L146
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            r3.append(r10)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            r6.be = r3     // Catch: java.lang.Throwable -> L1fa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r3.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = "cache h5 template to local success, templateId: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            r3.append(r7)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = ", path: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r4 = r6.be     // Catch: java.lang.Throwable -> L1fa
            r3.append(r4)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.d(r12, r3)     // Catch: java.lang.Throwable -> L1fa
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.t.b r2 = cn.jpush.android.t.b.a(r7, r2, r3)     // Catch: java.lang.Throwable -> L1fa
            r9.put(r7, r2)     // Catch: java.lang.Throwable -> L1fa
            a(r15, r9)     // Catch: java.lang.Throwable -> L1fa
            goto L151
        L146:
            java.lang.String r2 = r6.bj     // Catch: java.lang.Throwable -> L1fa
            r6.be = r2     // Catch: java.lang.Throwable -> L1fa
            goto L151
        L14b:
            java.lang.String r0 = "NOTE: failed to download html page. Give up this."
            cn.jpush.android.helper.Logger.w(r12, r0)     // Catch: java.lang.Throwable -> L1fa
            return r13
        L151:
            java.util.ArrayList<java.lang.String> r2 = r6.bn     // Catch: java.lang.Throwable -> L1fa
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1fa
            if (r2 <= 0) goto L1f5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r2.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = "template has image resource, start download image to local, images: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L1fa
            java.util.ArrayList<java.lang.String> r3 = r6.bn     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1fa
            r2.append(r3)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.d(r12, r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = "/"
            int r2 = r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L1fa
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r14, r2)     // Catch: java.lang.Throwable -> L1fa
            java.util.ArrayList<java.lang.String> r2 = r6.bn     // Catch: java.lang.Throwable -> L1fa
            java.util.ArrayList r0 = a(r2, r15, r1, r8)     // Catch: java.lang.Throwable -> L1fa
            if (r0 != 0) goto L18d
            java.lang.String r0 = "Load notify in-app message image resources failed, give up this in app!"
            cn.jpush.android.helper.Logger.w(r12, r0)     // Catch: java.lang.Throwable -> L1fa
            return r13
        L18d:
            java.lang.String r1 = "Load notify in-app message image succeed, webView will open cache!"
            cn.jpush.android.helper.Logger.d(r12, r1)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r1 = r6.bl     // Catch: java.lang.Throwable -> L1fa
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1bb
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1bb
        L199:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L1bb
            if (r14 >= r3) goto L1bd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bb
            r3.<init>()     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r4 = "in_pic_path"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1bb
            int r4 = r14 + 1
            r3.append(r4)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1bb
            java.lang.Object r5 = r0.get(r14)     // Catch: java.lang.Throwable -> L1bb
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L1bb
            r14 = r4
            goto L199
        L1bb:
            r0 = move-exception
            goto L1da
        L1bd:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1bb
            r6.bl = r0     // Catch: java.lang.Throwable -> L1bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bb
            r0.<init>()     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r2 = "http image resources replace local path, new templateData: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r2 = r6.bl     // Catch: java.lang.Throwable -> L1bb
            r0.append(r2)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1bb
            cn.jpush.android.helper.Logger.d(r12, r0)     // Catch: java.lang.Throwable -> L1bb
            goto L1fa
        L1da:
            r6.bl = r1     // Catch: java.lang.Throwable -> L1fa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1fa
            r1.<init>()     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r2 = "replace template picture resource error, "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L1fa
            r1.append(r0)     // Catch: java.lang.Throwable -> L1fa
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1fa
            cn.jpush.android.helper.Logger.w(r12, r0)     // Catch: java.lang.Throwable -> L1fa
            goto L1fa
        L1f5:
            java.lang.String r0 = "template no image resource."
            cn.jpush.android.helper.Logger.d(r12, r0)     // Catch: java.lang.Throwable -> L1fa
        L1fa:
            return r6
    }

    private static java.lang.String a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
            java.lang.String r1 = "InAppTplHelper"
            java.lang.String r4 = "inapp_image"
            r6 = 3145728(0x300000, float:4.408104E-39)
            r7 = 1
            r5 = 3
            r2 = r8
            r3 = r9
            byte[] r8 = cn.jpush.android.w.b.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc3
            if (r8 == 0) goto Lc6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r9.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "download image resource success, path: "
            r9.append(r0)     // Catch: java.lang.Throwable -> L38
            r9.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.d(r1, r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r9 = "http://"
            boolean r9 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L38
            r0 = 1
            if (r9 != 0) goto L3c
            java.lang.String r9 = "https://"
            boolean r9 = r3.startsWith(r9)     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L36
            goto L3c
        L36:
            r9 = r3
            goto L40
        L38:
            r0 = move-exception
            r8 = r0
            goto Lbd
        L3c:
            java.lang.String r9 = cn.jpush.android.ad.c.a(r3, r0)     // Catch: java.lang.Throwable -> L38
        L40:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "j_in_app_"
            r5.append(r6)     // Catch: java.lang.Throwable -> L38
            r5.append(r10)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L38
            r5 = 0
            java.lang.String r10 = cn.jpush.android.ad.c.a(r2, r10, r5, r0)     // Catch: java.lang.Throwable -> L38
            r4.append(r10)     // Catch: java.lang.Throwable -> L38
            r4.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L38
            boolean r8 = cn.jpush.android.ad.c.a(r10, r8)     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto La0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r8.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "download image resource cache to local success, path: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L38
            r8.append(r10)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.d(r1, r8)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r8.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "download image resource cache to local success, Uri.fromFile: "
            r8.append(r0)     // Catch: java.lang.Throwable -> L38
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L38
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L38
            android.net.Uri r9 = android.net.Uri.fromFile(r0)     // Catch: java.lang.Throwable -> L38
            r8.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.d(r1, r8)     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.ad.e.a(r10, r3)     // Catch: java.lang.Throwable -> L38
            return r10
        La0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r9.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = "Succeed to load image - "
            r9.append(r0)     // Catch: java.lang.Throwable -> L38
            r9.append(r10)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = ", cache local status: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L38
            r9.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.v(r1, r8)     // Catch: java.lang.Throwable -> L38
            goto Lf3
        Lbd:
            java.lang.String r9 = "Write storage error,  create img file fail."
            cn.jpush.android.helper.Logger.ww(r1, r9, r8)     // Catch: java.lang.Throwable -> Lc3
            goto Lf3
        Lc3:
            r0 = move-exception
            r8 = r0
            goto Ldb
        Lc6:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r8.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = "download image resource failed, path: "
            r8.append(r9)     // Catch: java.lang.Throwable -> Lc3
            r8.append(r3)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lc3
            cn.jpush.android.helper.Logger.w(r1, r8)     // Catch: java.lang.Throwable -> Lc3
            goto Lf3
        Ldb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "load h5 template image resource failed, "
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jpush.android.helper.Logger.w(r1, r8)
        Lf3:
            r8 = 0
            return r8
    }

    private static java.util.ArrayList<java.lang.String> a(java.util.ArrayList<java.lang.String> r1, android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = 1
            java.util.ArrayList r1 = a(r1, r2, r3, r4, r0)
            return r1
    }

    private static java.util.ArrayList<java.lang.String> a(java.util.ArrayList<java.lang.String> r10, android.content.Context r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action:loadH5TemplateImageResources - urlPrefix:"
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InAppTplHelper"
            cn.jpush.android.helper.Logger.v(r2, r1)
            r1 = 0
            boolean r3 = cn.jpush.android.ad.a.c(r12)     // Catch: java.lang.Throwable -> L67
            r4 = 1
            if (r3 == 0) goto L141
            if (r11 == 0) goto L141
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L67
            if (r3 <= 0) goto L141
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L67
            if (r13 != 0) goto L141
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L67
        L35:
            boolean r13 = r10.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r13 == 0) goto L127
            java.lang.Object r13 = r10.next()     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L67
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "https://"
            java.lang.String r6 = "http://"
            if (r3 != 0) goto L6a
            boolean r3 = r13.startsWith(r6)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L6a
            boolean r3 = r13.startsWith(r5)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L6a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            r3.append(r12)     // Catch: java.lang.Throwable -> L67
            r3.append(r13)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r10 = move-exception
            goto L143
        L6a:
            r3 = r13
        L6b:
            boolean r7 = cn.jpush.android.ad.a.a(r3, r1)     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L110
            java.lang.String r7 = "h5_tpl"
            r8 = 3
            r9 = 1048576(0x100000, float:1.469368E-39)
            byte[] r7 = cn.jpush.android.w.b.a(r11, r3, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto Lfb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = "download image resource success, path: "
            r3.append(r8)     // Catch: java.lang.Throwable -> L9d
            r3.append(r13)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            cn.jpush.android.helper.Logger.d(r2, r3)     // Catch: java.lang.Throwable -> L9d
            boolean r3 = r13.startsWith(r6)     // Catch: java.lang.Throwable -> L9d
            if (r3 != 0) goto L9f
            boolean r3 = r13.startsWith(r5)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto La3
            goto L9f
        L9d:
            r13 = move-exception
            goto Lf3
        L9f:
            java.lang.String r13 = cn.jpush.android.ad.c.a(r13, r1)     // Catch: java.lang.Throwable -> L9d
        La3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r3.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "h5_noti_imgs"
            java.lang.String r5 = cn.jpush.android.ad.c.a(r11, r5, r1, r14)     // Catch: java.lang.Throwable -> L9d
            r3.append(r5)     // Catch: java.lang.Throwable -> L9d
            r3.append(r13)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            boolean r3 = cn.jpush.android.ad.c.a(r13, r7)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto Ld5
            r0.add(r13)     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r5.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = "download image resource cache to local success, path: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9d
            r5.append(r13)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9d
            cn.jpush.android.helper.Logger.d(r2, r5)     // Catch: java.lang.Throwable -> L9d
        Ld5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r5.<init>()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = "Succeed to load image - "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9d
            r5.append(r13)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r13 = ", cache local status: "
            r5.append(r13)     // Catch: java.lang.Throwable -> L9d
            r5.append(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r13 = r5.toString()     // Catch: java.lang.Throwable -> L9d
            cn.jpush.android.helper.Logger.v(r2, r13)     // Catch: java.lang.Throwable -> L9d
            goto L35
        Lf3:
            java.lang.String r3 = "Write storage error,  create img file fail."
            cn.jpush.android.helper.Logger.ww(r2, r3, r13)     // Catch: java.lang.Throwable -> L67
        Lf8:
            r4 = 0
            goto L35
        Lfb:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r13.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "download image resource failed, path: "
            r13.append(r4)     // Catch: java.lang.Throwable -> L67
            r13.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L67
        L10c:
            cn.jpush.android.helper.Logger.w(r2, r13)     // Catch: java.lang.Throwable -> L67
            goto Lf8
        L110:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r13.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "image url "
            r13.append(r4)     // Catch: java.lang.Throwable -> L67
            r13.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = " is not image url"
            r13.append(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L67
            goto L10c
        L127:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r10.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r11 = "template image resource download completed. local image list: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L67
            r10.append(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L67
            cn.jpush.android.helper.Logger.i(r2, r10)     // Catch: java.lang.Throwable -> L67
            r1 = r4
            goto L15b
        L141:
            r1 = 1
            goto L15b
        L143:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "load h5 template image resource failed, "
            r11.append(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jpush.android.helper.Logger.w(r2, r10)
        L15b:
            if (r1 == 0) goto L15e
            goto L15f
        L15e:
            r0 = 0
        L15f:
            return r0
    }

    private static java.util.LinkedHashMap<java.lang.String, cn.jpush.android.t.b> a(android.content.Context r6) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "InAppTplHelper"
            if (r6 != 0) goto Lf
            java.lang.String r6 = "readTemplateConfig context is null"
            cn.jpush.android.helper.Logger.w(r1, r6)
            return r0
        Lf:
            r2 = 0
            java.lang.String r3 = "tpl.cache"
            java.io.File r6 = cn.jpush.android.ad.c.a(r6, r3)     // Catch: java.lang.Throwable -> L4d
            if (r6 == 0) goto L4f
            boolean r3 = r6.exists()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4f
            java.lang.String r6 = cn.jpush.android.ad.c.c(r6)     // Catch: java.lang.Throwable -> L4d
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L4f
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r6 = r3.keys()     // Catch: java.lang.Throwable -> L4d
        L31:
            boolean r4 = r6.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L4d
            org.json.JSONObject r4 = r3.getJSONObject(r4)     // Catch: java.lang.Throwable -> L4d
            cn.jpush.android.t.b r4 = cn.jpush.android.t.b.a(r4)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L31
            java.lang.String r5 = r4.a     // Catch: java.lang.Throwable -> L4d
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L4d
            goto L31
        L4d:
            r6 = move-exception
            goto L53
        L4f:
            cn.jpush.android.ad.m.a(r2)
            return r0
        L53:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r3.<init>()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "readTemplateConfig failed, "
            r3.append(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L6f
            r3.append(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            cn.jpush.android.helper.Logger.w(r1, r6)     // Catch: java.lang.Throwable -> L6f
            cn.jpush.android.ad.m.a(r2)
            return r0
        L6f:
            r6 = move-exception
            cn.jpush.android.ad.m.a(r2)
            throw r6
    }

    public static java.util.LinkedHashMap<java.lang.String, cn.jpush.android.t.b> a(java.util.LinkedHashMap<java.lang.String, cn.jpush.android.t.b> r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L36
            cn.jpush.android.r.c$1 r3 = new cn.jpush.android.r.c$1     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
            java.util.Collections.sort(r1, r3)     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L36
        L1a:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L36
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L36
            cn.jpush.android.t.b r1 = (cn.jpush.android.t.b) r1     // Catch: java.lang.Throwable -> L36
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L36
            goto L1a
        L36:
            r3 = move-exception
            goto L39
        L38:
            return r0
        L39:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sortHashMap failed, "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "InAppTplHelper"
            cn.jpush.android.helper.Logger.w(r1, r3)
            return r0
    }

    private static void a(android.content.Context r8, java.util.LinkedHashMap<java.lang.String, cn.jpush.android.t.b> r9) {
            java.lang.String r0 = "InAppTplHelper"
            java.lang.String r1 = "tpl.cache"
            java.io.File r8 = cn.jpush.android.ad.c.a(r8, r1)     // Catch: java.lang.Throwable -> L10
            if (r8 != 0) goto L13
            java.lang.String r8 = "saveTemplateConfig file is null"
            cn.jpush.android.helper.Logger.w(r0, r8)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r8 = move-exception
            goto Lb8
        L13:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r1.<init>()     // Catch: java.lang.Throwable -> L10
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L10
            r3 = 20
            if (r2 <= r3) goto L24
            java.util.LinkedHashMap r9 = a(r9)     // Catch: java.lang.Throwable -> L10
        L24:
            java.util.Set r2 = r9.entrySet()     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L10
            r4 = 0
        L2d:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L84
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L10
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L10
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L10
            cn.jpush.android.t.b r6 = (cn.jpush.android.t.b) r6     // Catch: java.lang.Throwable -> L10
            if (r4 >= r3) goto L4f
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L10
            org.json.JSONObject r6 = r6.a()     // Catch: java.lang.Throwable -> L10
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L10
            goto L81
        L4f:
            java.lang.String r5 = r6.f1910b     // Catch: java.lang.Throwable -> L10
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L10
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L10
            boolean r7 = r6.exists()     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto L81
            boolean r7 = r6.isFile()     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto L81
            r6.delete()     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r6.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "exceed max template cache count, delete old template file: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L10
            r6.append(r5)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = ", maxCacheCount: "
            r6.append(r5)     // Catch: java.lang.Throwable -> L10
            r6.append(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L10
            cn.jpush.android.helper.Logger.d(r0, r5)     // Catch: java.lang.Throwable -> L10
        L81:
            int r4 = r4 + 1
            goto L2d
        L84:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r2.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = "[saveTemplateConfig] template config info: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L10
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r3 = ", templateSize: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L10
            java.util.Collection r9 = r9.values()     // Catch: java.lang.Throwable -> L10
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L10
            r2.append(r9)     // Catch: java.lang.Throwable -> L10
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L10
            cn.jpush.android.helper.Logger.d(r0, r9)     // Catch: java.lang.Throwable -> L10
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L10
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L10
            cn.jpush.android.ad.c.a(r8, r9)     // Catch: java.lang.Throwable -> L10
            return
        Lb8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "saveTemplateConfig failed, "
            r9.append(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jpush.android.helper.Logger.w(r0, r8)
            return
    }

    public static cn.jpush.android.d.d b(android.content.Context r17, cn.jpush.android.d.d r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "banner"
            java.lang.String r3 = "small_image"
            java.lang.String r4 = "image"
            java.lang.String r5 = "InAppTplHelper"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r1.f1762i     // Catch: java.lang.Throwable -> L73
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L73
            boolean r7 = r6.has(r4)     // Catch: java.lang.Throwable -> L73
            r8 = 4
            r9 = 3008(0xbc0, double:1.486E-320)
            r11 = 10
            java.lang.String r12 = "http"
            r14 = 1
            if (r7 == 0) goto L93
            java.lang.String r7 = r6.optString(r4)     // Catch: java.lang.Throwable -> L73
            boolean r15 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L73
            if (r15 != 0) goto L93
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r15.<init>()     // Catch: java.lang.Throwable -> L73
            r16 = 0
            java.lang.String r13 = "handleImage path: "
            r15.append(r13)     // Catch: java.lang.Throwable -> L73
            r15.append(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.d(r5, r13)     // Catch: java.lang.Throwable -> L73
            boolean r13 = r7.startsWith(r12)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L95
            boolean r13 = cn.jpush.android.ad.a.a(r7, r14)     // Catch: java.lang.Throwable -> L73
            if (r13 == 0) goto L7b
            java.lang.String r13 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            java.lang.String r13 = a(r0, r7, r13)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r15.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r14 = "handleImage downImage: "
            r15.append(r14)     // Catch: java.lang.Throwable -> L73
            r15.append(r13)     // Catch: java.lang.Throwable -> L73
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.d(r5, r14)     // Catch: java.lang.Throwable -> L73
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L73
            if (r14 == 0) goto L76
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            b(r0, r7, r2)     // Catch: java.lang.Throwable -> L73
            return r16
        L73:
            r0 = move-exception
            goto L11e
        L76:
            r6.put(r4, r13)     // Catch: java.lang.Throwable -> L73
            r4 = 1
            goto L96
        L7b:
            int r4 = r1.bt     // Catch: java.lang.Throwable -> L73
            if (r11 == r4) goto L95
            java.lang.String r2 = "handleImage path  is not image so delete cache message"
            cn.jpush.android.helper.Logger.d(r5, r2)     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.c.a(r0, r2, r9, r8)     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            r0.c(r2)     // Catch: java.lang.Throwable -> L73
            return r16
        L93:
            r16 = 0
        L95:
            r4 = 0
        L96:
            int r7 = r1.bt     // Catch: java.lang.Throwable -> L73
            if (r11 != r7) goto L114
            boolean r7 = r6.has(r2)     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L114
            org.json.JSONObject r2 = r6.getJSONObject(r2)     // Catch: java.lang.Throwable -> L73
            boolean r7 = r2.has(r3)     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L114
            java.lang.String r7 = r2.optString(r3)     // Catch: java.lang.Throwable -> L73
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L73
            if (r11 != 0) goto L114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r11.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r13 = "handleImage small path: "
            r11.append(r13)     // Catch: java.lang.Throwable -> L73
            r11.append(r7)     // Catch: java.lang.Throwable -> L73
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.d(r5, r11)     // Catch: java.lang.Throwable -> L73
            boolean r11 = r7.startsWith(r12)     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L114
            r11 = 1
            boolean r4 = cn.jpush.android.ad.a.a(r7, r11)     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L100
            java.lang.String r4 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = a(r0, r7, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r8.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r9 = "handleImage  small downImage: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L73
            r8.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.Logger.d(r5, r8)     // Catch: java.lang.Throwable -> L73
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L73
            if (r8 == 0) goto Lfb
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            b(r0, r7, r2)     // Catch: java.lang.Throwable -> L73
            return r16
        Lfb:
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L73
            r14 = 1
            goto L115
        L100:
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.helper.c.a(r0, r2, r9, r8)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "handleImage small  path  is not image so delete cache message"
            cn.jpush.android.helper.Logger.d(r5, r0)     // Catch: java.lang.Throwable -> L73
            cn.jpush.android.p.b r0 = cn.jpush.android.p.b.a()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r1.f1757d     // Catch: java.lang.Throwable -> L73
            r0.c(r2)     // Catch: java.lang.Throwable -> L73
            return r16
        L114:
            r14 = r4
        L115:
            if (r14 == 0) goto L11d
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L73
            r1.f1762i = r0     // Catch: java.lang.Throwable -> L73
        L11d:
            return r1
        L11e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load  image resource failed, "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jpush.android.helper.Logger.w(r5, r0)
            return r1
    }

    private static void b(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "handleImage   downImage is null "
            java.lang.String r1 = "InAppTplHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.String r0 = cn.jpush.android.w.b.a(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleImage   downImage is null,errorCode= "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jpush.android.helper.Logger.d(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2e
            java.lang.String r4 = "downImage fail by network,so save it,wait network change good to show "
            cn.jpush.android.helper.Logger.d(r1, r4)
            cn.jpush.android.w.b.b(r5)
            return
        L2e:
            java.lang.String r5 = "downImage fail by other reason，so delete message"
            cn.jpush.android.helper.Logger.d(r1, r5)
            r0 = 3008(0xbc0, double:1.486E-320)
            r5 = 4
            cn.jpush.android.helper.c.a(r4, r6, r0, r5)
            cn.jpush.android.p.b r4 = cn.jpush.android.p.b.a()
            r4.c(r6)
            return
    }
}
