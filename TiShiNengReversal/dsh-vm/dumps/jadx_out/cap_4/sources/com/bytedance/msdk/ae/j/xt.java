package com.bytedance.msdk.ae.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    private static volatile com.bytedance.msdk.ae.j.xt j;
    private java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> cw;
    private com.bytedance.msdk.tl.l xt;


    private xt() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.r()
            r1.xt = r0
            return
    }

    private void cw(org.json.JSONObject r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.bytedance.msdk.ae.j.xt$1 r0 = new com.bytedance.msdk.ae.j.xt$1
            r0.<init>(r1, r2)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static com.bytedance.msdk.ae.j.xt j() {
            com.bytedance.msdk.ae.j.xt r0 = com.bytedance.msdk.ae.j.xt.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.ae.j.xt> r0 = com.bytedance.msdk.ae.j.xt.class
            monitor-enter(r0)
            com.bytedance.msdk.ae.j.xt r1 = com.bytedance.msdk.ae.j.xt.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.ae.j.xt r1 = new com.bytedance.msdk.ae.j.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.ae.j.xt.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.ae.j.xt r0 = com.bytedance.msdk.ae.j.xt.j
            return r0
    }

    private java.util.List<java.lang.String> j(android.content.Context r5) {
            r4 = this;
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.pm.ApplicationInfo r1 = r5.getApplicationInfo()
            java.lang.String r1 = r1.processName
            android.content.pm.ApplicationInfo r2 = r5.getApplicationInfo()
            int r2 = r2.uid
            r3 = 131072(0x20000, float:1.83671E-40)
            java.util.List r0 = r0.queryContentProviders(r1, r2, r3)
            if (r0 != 0) goto L1a
            r5 = 0
            return r5
        L1a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.getPackageName()
            java.util.Iterator r5 = r0.iterator()
        L26:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L10d
            java.lang.Object r0 = r5.next()
            android.content.pm.ProviderInfo r0 = (android.content.pm.ProviderInfo) r0
            java.lang.String r0 = r0.name
            r0.getClass()
            int r2 = r0.hashCode()
            r3 = -1
            switch(r2) {
                case -2132028139: goto Lb8;
                case -1630533804: goto Lad;
                case -1097984862: goto La2;
                case -941604608: goto L97;
                case 8917003: goto L8c;
                case 405711305: goto L81;
                case 787345346: goto L76;
                case 980611709: goto L6b;
                case 1010345138: goto L5d;
                case 1011081416: goto L4f;
                case 1719438508: goto L41;
                default: goto L3f;
            }
        L3f:
            goto Lc2
        L41:
            java.lang.String r2 = "com.qq.e.comm.GDTFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4b
            goto Lc2
        L4b:
            r3 = 10
            goto Lc2
        L4f:
            java.lang.String r2 = "com.unity"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L59
            goto Lc2
        L59:
            r3 = 9
            goto Lc2
        L5d:
            java.lang.String r2 = "com.bytedance.sdk.openadsdk.TTFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L67
            goto Lc2
        L67:
            r3 = 8
            goto Lc2
        L6b:
            java.lang.String r2 = "com.kwad.sdk.api.proxy.app.AdSdkFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L74
            goto Lc2
        L74:
            r3 = 7
            goto Lc2
        L76:
            java.lang.String r2 = "com.bykv.vk.openvk.TTFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L7f
            goto Lc2
        L7f:
            r3 = 6
            goto Lc2
        L81:
            java.lang.String r2 = "com.google.android.gms.ads.MobileAdsInitProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L8a
            goto Lc2
        L8a:
            r3 = 5
            goto Lc2
        L8c:
            java.lang.String r2 = "com.tencent.klevin.utils.FileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L95
            goto Lc2
        L95:
            r3 = 4
            goto Lc2
        L97:
            java.lang.String r2 = "com.sigmob.sdk.SigmobFileV4Provider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto La0
            goto Lc2
        La0:
            r3 = 3
            goto Lc2
        La2:
            java.lang.String r2 = "com.sigmob.sdk.SigmobFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lab
            goto Lc2
        Lab:
            r3 = 2
            goto Lc2
        Lad:
            java.lang.String r2 = "com.mbridge.msdk.foundation.tools.MBFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lb6
            goto Lc2
        Lb6:
            r3 = 1
            goto Lc2
        Lb8:
            java.lang.String r2 = "com.baidu.mobads.sdk.api.BdFileProvider"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lc1
            goto Lc2
        Lc1:
            r3 = 0
        Lc2:
            switch(r3) {
                case 0: goto L106;
                case 1: goto Lff;
                case 2: goto Lf8;
                case 3: goto Lf8;
                case 4: goto Lf1;
                case 5: goto Lea;
                case 6: goto Le3;
                case 7: goto Ldc;
                case 8: goto Ld5;
                case 9: goto Lce;
                case 10: goto Lc7;
                default: goto Lc5;
            }
        Lc5:
            goto L26
        Lc7:
            java.lang.String r0 = "gdt"
            r1.add(r0)
            goto L26
        Lce:
            java.lang.String r0 = "unity"
            r1.add(r0)
            goto L26
        Ld5:
            java.lang.String r0 = "pangle"
            r1.add(r0)
            goto L26
        Ldc:
            java.lang.String r0 = "ks"
            r1.add(r0)
            goto L26
        Le3:
            java.lang.String r0 = "pangle_custom"
            r1.add(r0)
            goto L26
        Lea:
            java.lang.String r0 = "admob"
            r1.add(r0)
            goto L26
        Lf1:
            java.lang.String r0 = "klevin"
            r1.add(r0)
            goto L26
        Lf8:
            java.lang.String r0 = "sigmob"
            r1.add(r0)
            goto L26
        Lff:
            java.lang.String r0 = "mintegral"
            r1.add(r0)
            goto L26
        L106:
            java.lang.String r0 = "baidu"
            r1.add(r0)
            goto L26
        L10d:
            return r1
    }

    private java.util.Set<java.lang.String> m() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r1 = r4.cw
            int r1 = r1.size()
            if (r1 == 0) goto L39
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r1 = r4.cw
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.bytedance.msdk.core.oq.j r3 = (com.bytedance.msdk.core.oq.j) r3
            if (r3 == 0) goto L17
            boolean r3 = r3.r()
            if (r3 != 0) goto L17
            java.lang.Object r2 = r2.getKey()
            r0.add(r2)
            goto L17
        L39:
            return r0
    }

    private void up() {
            r2 = this;
            com.bytedance.msdk.tl.l r0 = r2.xt
            java.lang.String r1 = "adn_init_config"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            goto L3a
        Lf:
            java.lang.String r1 = "["
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = "{"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L27
            java.lang.String r1 = com.bytedance.msdk.tl.xt.j()
            java.lang.String r0 = com.bytedance.msdk.tl.j.xt(r0, r1)
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L3a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r2.xt(r1)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L3a:
            return
    }

    private void xt(org.json.JSONObject r5) {
            r4 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r4.cw
            r0.clear()
            java.util.Iterator r0 = r5.keys()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r2 = r5.optJSONObject(r1)
            com.bytedance.msdk.core.oq.j r3 = com.bytedance.msdk.core.oq.j.j(r1, r2)
            if (r2 == 0) goto L9
            if (r3 == 0) goto L9
            java.lang.String r2 = "pangle"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 == 0) goto L3b
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()
            boolean r2 = r2.uf()
            if (r2 == 0) goto L3b
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r1 = r4.cw
            java.lang.String r2 = "pangle_custom"
            r1.put(r2, r3)
            goto L9
        L3b:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r2 = r4.cw
            r2.put(r1, r3)
            goto L9
        L41:
            return
    }

    public boolean cw() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r1.cw
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            r1.up()
        Lb:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r1.cw
            boolean r0 = r0.isEmpty()
            return r0
    }

    public com.bytedance.msdk.core.oq.j j(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r1.cw
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            r1.up()
        Lb:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r1.cw
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.core.oq.j r2 = (com.bytedance.msdk.core.oq.j) r2
            return r2
    }

    public void j(org.json.JSONObject r4) {
            r3 = this;
            if (r4 == 0) goto L16
            r3.xt(r4)
            java.lang.String r0 = r4.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            com.bytedance.msdk.tl.l r1 = r3.xt
            java.lang.String r2 = "adn_init_config"
            r1.j(r2, r0)
        L16:
            r3.cw(r4)
            return
    }

    public synchronized void r() {
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L9
            monitor-exit(r7)
            return
        L9:
            java.util.Set r1 = r7.m()     // Catch: java.lang.Throwable -> L84
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L15
            monitor-exit(r7)
            return
        L15:
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L84
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "TTMediationSDK_SDK_Init"
            java.lang.String r4 = "------------------ 聚合 接入信息 start ---------------------"
            com.bytedance.msdk.j.up.cw.xt(r3, r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "TTMediationSDK_SDK_Init"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "当前接入的聚合 SDK版本是："
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = com.bytedance.msdk.xt.xt.xt()     // Catch: java.lang.Throwable -> L84
            r4.append(r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L84
            com.bytedance.msdk.j.up.cw.j(r3, r4)     // Catch: java.lang.Throwable -> L84
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L84
            r4 = 24
            if (r3 >= r4) goto L41
            if (r2 < r4) goto Lbf
        L41:
            java.util.List r0 = r7.j(r0)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto Lbf
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        L4b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto Lbf
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "unity"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L4b
            java.lang.String r4 = "pangle_custom"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L4b
            java.lang.String r4 = "xiaomi"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto L4b
            java.lang.String r4 = "pangle"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L87
            com.bytedance.msdk.core.j r4 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.uf()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L87
            java.lang.String r3 = "pangle_custom"
            goto L87
        L84:
            r0 = move-exception
            goto L115
        L87:
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L84
            if (r4 != 0) goto La6
            java.lang.String r4 = "TTMediationSDK_SDK_Init"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "未按要求接入三方广告sdk【"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L84
            r5.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "】，请检查接入配置"
            r5.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L84
            com.bytedance.msdk.j.up.cw.r(r4, r3)     // Catch: java.lang.Throwable -> L84
            goto L4b
        La6:
            java.lang.String r4 = "TTMediationSDK_SDK_Init"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "已按要求接入三方广告sdk【"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L84
            r5.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "】"
            r5.append(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L84
            com.bytedance.msdk.j.up.cw.xt(r4, r3)     // Catch: java.lang.Throwable -> L84
            goto L4b
        Lbf:
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            java.lang.String r2 = "------------------ GroMore 接入信息 end ---------------------"
            com.bytedance.msdk.j.up.cw.xt(r0, r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            java.lang.String r2 = "------------------ GroMore 版本信息 start ---------------------"
            com.bytedance.msdk.j.up.cw.xt(r0, r2)     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L84
        Ld1:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L10c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "pangle"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto Ld1
            com.bytedance.msdk.m.xt.xt r2 = com.bytedance.msdk.m.xt.xt.j()     // Catch: java.lang.Throwable -> L84
            com.bytedance.msdk.j.j.r r2 = r2.j(r1)     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto Lf3
            r2.r()     // Catch: java.lang.Throwable -> L84
            goto Ld1
        Lf3:
            java.lang.String r2 = "TTMediationSDK_InitChecker"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "没有引入"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L84
            r3.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "Adapter,请检查相关引入情况"
            r3.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L84
            com.bytedance.msdk.j.up.cw.r(r2, r1)     // Catch: java.lang.Throwable -> L84
            goto Ld1
        L10c:
            java.lang.String r0 = "TTMediationSDK_SDK_Init"
            java.lang.String r1 = "------------------ GroMore 版本信息 end ---------------------"
            com.bytedance.msdk.j.up.cw.xt(r0, r1)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r7)
            return
        L115:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L84
            throw r0
    }

    public java.util.List<com.bytedance.msdk.core.oq.j> xt() {
            r4 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r4.cw
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            r4.up()
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r1 = r4.cw
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            com.bytedance.msdk.core.oq.j r2 = (com.bytedance.msdk.core.oq.j) r2
            if (r2 == 0) goto L1a
            boolean r3 = r2.r()
            if (r3 == 0) goto L1a
            r0.add(r2)
            goto L1a
        L38:
            return r0
    }

    public boolean xt(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r2.cw
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            r2.up()
        Lb:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.j> r0 = r2.cw
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.msdk.core.oq.j r3 = (com.bytedance.msdk.core.oq.j) r3
            if (r3 == 0) goto L21
            boolean r3 = r3.r()
            if (r3 == 0) goto L21
            r3 = 1
            return r3
        L21:
            return r1
    }
}
