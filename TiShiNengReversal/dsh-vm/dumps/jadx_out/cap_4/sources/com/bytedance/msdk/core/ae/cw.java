package com.bytedance.msdk.core.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static java.lang.String cw = "KEY_LOAD_SEQ_TIME";
    private static java.util.Comparator<com.bytedance.msdk.xt.cw> j = null;
    private static java.lang.String xt = "KEY_LOAD_SEQ";


    static {
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String cw() {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static com.bytedance.msdk.core.oq.oq j(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            com.bytedance.msdk.core.oq.oq r0 = new com.bytedance.msdk.core.oq.oq
            r0.<init>()
            r0.cw(r2)
            r0.up(r1)
            r1 = 0
            r0.oq(r1)
            java.lang.String r1 = "0"
            r0.m(r1)
            java.lang.String r1 = "1"
            r0.xt(r1)
            r0.qv(r3)
            r0.vl(r4)
            r1 = 3
            r0.g(r1)
            java.lang.String r1 = "%1$s%2$sAdapter"
            r0.j(r1)
            return r0
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1c
            r0 = 0
            r1 = 1
            java.lang.String r0 = r2.substring(r0, r1)
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r2 = r0.concat(r2)
        L1c:
            return r2
    }

    public static java.lang.String j(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "pangle"
            java.lang.String r1 = com.bytedance.msdk.xt.j.j(r5)
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L2c
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.uf()
            if (r0 == 0) goto L2c
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r0 = "PangleCustom"
            r5[r2] = r0
            r5[r1] = r6
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.String r5 = "com.bytedance.msdk.adapter.panglecustom."
            java.lang.String r4 = r5.concat(r4)
            return r4
        L2c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r5
            r0[r1] = r6
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "com.bytedance.msdk.adapter."
            r6.<init>(r0)
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5)
            r6.append(r5)
            java.lang.String r5 = "."
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            return r4
    }

    public static java.util.Comparator<com.bytedance.msdk.xt.cw> j() {
            java.util.Comparator<com.bytedance.msdk.xt.cw> r0 = com.bytedance.msdk.core.ae.cw.j
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.Comparator r0 = xt()
            return r0
    }

    public static void j(com.bytedance.msdk.api.j r5, com.bytedance.msdk.core.oq.oq r6) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.nd()
            if (r0 == 0) goto L57
            if (r5 == 0) goto L57
            if (r6 == 0) goto L57
            r0 = 820001(0xc8321, float:1.149066E-39)
            int r1 = r5.j
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L2d
            android.content.Context r5 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r6 = r6.i()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r6
            java.lang.String r6 = "error_adn:%1$s no ads，please check ad network"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            com.bytedance.msdk.api.r.j(r5, r6)
            return
        L2d:
            java.lang.String r0 = r6.i()
            java.lang.String r6 = r6.w()
            int r1 = r5.cw
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = r5.f2149r
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r0
            r4[r3] = r6
            r6 = 2
            r4[r6] = r1
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "test error_adn:%1$s  error_slot_id: %2$s  error_code:%3$d  error_message:%4$s"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.api.r.j(r6, r5)
        L57:
            return
    }

    public static void j(java.lang.String r1, com.bytedance.msdk.core.oq.oq r2, com.bytedance.msdk.xt.cw r3) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.nd()
            if (r0 == 0) goto L34
            if (r2 == 0) goto L34
            boolean r1 = xt(r1, r3)
            if (r1 == 0) goto L34
            java.lang.String r1 = r2.az()
            int r2 = r2.mi()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "fill_suceess ,test_adn:%1$s,slot_id : %2$s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.api.r.j(r2, r1)
        L34:
            return
    }

    public static void j(java.lang.String r2, com.bytedance.msdk.xt.cw r3) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.nd()
            if (r0 == 0) goto L34
            if (r3 == 0) goto L34
            boolean r2 = xt(r2, r3)
            if (r2 == 0) goto L34
            int r2 = r3.pz()
            java.lang.String r2 = com.bytedance.msdk.xt.j.j(r2)
            java.lang.String r3 = r3.qa()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "test_suceess ,test_adn:%1$s,slot_id : %2$s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.api.r.j(r3, r2)
        L34:
            return
    }

    public static void j(java.util.List<com.bytedance.msdk.xt.cw> r0, java.util.Comparator<com.bytedance.msdk.xt.cw> r1) {
            if (r1 != 0) goto L6
            com.bytedance.msdk.tl.la.j(r0)
            return
        L6:
            com.bytedance.msdk.tl.la.j(r0, r1)
            return
    }

    public static boolean j(com.bytedance.msdk.core.oq.oq r4) {
            r0 = 1
            if (r4 == 0) goto L10
            java.lang.String r1 = r4.az()
            java.lang.String r2 = "pangle"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L10
            return r0
        L10:
            if (r4 == 0) goto L1d
            java.lang.String r1 = r4.az()
            boolean r1 = com.bytedance.msdk.core.j.j.up.j(r1)
            if (r1 == 0) goto L1d
            return r0
        L1d:
            if (r4 == 0) goto L73
            com.bytedance.msdk.core.qv.j r0 = com.bytedance.msdk.core.qv.j.j()
            java.util.function.Function r0 = r0.ae()
            if (r0 == 0) goto L6c
            java.lang.String r1 = xt(r4)
            java.lang.String r4 = r4.az()
            java.lang.String r4 = com.bytedance.msdk.m.xt.r.xt(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L73
            com.bykv.j.j.j.j.e r2 = com.bykv.j.j.j.j.e.a()
            r3 = 8010(0x1f4a, float:1.1224E-41)
            r2.g(r3, r1)
            r1 = 8560(0x2170, float:1.1995E-41)
            r2.g(r1, r4)
            r4 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r1 = 8229(0x2025, float:1.1531E-41)
            r2.e(r4, r1)
            r4 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r2.f(r4, r1)
            com.bykv.vk.openvk.api.proto.PluginValueSet r4 = r2.k()
            android.util.SparseArray r4 = r4.sparseArray()
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r0, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L6c:
            java.lang.String r4 = "TTMediationSDK"
            java.lang.String r0 = "load ad check class loader is null "
            com.bytedance.msdk.j.up.cw.xt(r4, r0)
        L73:
            r4 = 0
            return r4
    }

    private static boolean j(java.util.Date r3, java.util.Date r4) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTime(r4)
            r4 = 1
            int r1 = r0.get(r4)
            int r2 = r3.get(r4)
            if (r1 != r2) goto L30
            r1 = 2
            int r2 = r0.get(r1)
            int r1 = r3.get(r1)
            if (r2 != r1) goto L30
            r1 = 5
            int r0 = r0.get(r1)
            int r3 = r3.get(r1)
            if (r0 != r3) goto L30
            return r4
        L30:
            r3 = 0
            return r3
    }

    public static int r() {
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            r1 = 0
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r1, r0)
            java.lang.String r2 = com.bytedance.msdk.core.ae.cw.cw
            r3 = 0
            long r2 = r0.xt(r2, r3)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r4)
            boolean r0 = j(r0, r2)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r2 = com.bytedance.msdk.tl.l.j(r1, r2)
            java.lang.String r3 = com.bytedance.msdk.core.ae.cw.cw
            r2.j(r3, r4)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r2 = com.bytedance.msdk.tl.l.j(r1, r2)
            java.lang.String r3 = com.bytedance.msdk.core.ae.cw.xt
            r4 = 0
            int r2 = r2.xt(r3, r4)
            if (r0 != 0) goto L42
            goto L43
        L42:
            r4 = r2
        L43:
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r1, r0)
            java.lang.String r1 = com.bytedance.msdk.core.ae.cw.xt
            int r4 = r4 + 1
            r0.j(r1, r4)
            return r4
    }

    private static java.lang.String xt(com.bytedance.msdk.core.oq.oq r14) {
            java.lang.String r0 = ""
            if (r14 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r14.az()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r2) {
                case -1128782217: goto L86;
                case -995541405: goto L7b;
                case -902468465: goto L70;
                case -759499589: goto L65;
                case 3432: goto L5a;
                case 102199: goto L4f;
                case 92668925: goto L44;
                case 93498907: goto L39;
                case 111433589: goto L2b;
                case 1126045977: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto L90
        L1d:
            java.lang.String r2 = "mintegral"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L27
            goto L90
        L27:
            r10 = 9
            goto L90
        L2b:
            java.lang.String r2 = "unity"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
            goto L90
        L35:
            r10 = 8
            goto L90
        L39:
            java.lang.String r2 = "baidu"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
            goto L90
        L42:
            r10 = 7
            goto L90
        L44:
            java.lang.String r2 = "admob"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4d
            goto L90
        L4d:
            r10 = 6
            goto L90
        L4f:
            java.lang.String r2 = "gdt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L58
            goto L90
        L58:
            r10 = 5
            goto L90
        L5a:
            java.lang.String r2 = "ks"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L63
            goto L90
        L63:
            r10 = 4
            goto L90
        L65:
            java.lang.String r2 = "xiaomi"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            goto L90
        L6e:
            r10 = 3
            goto L90
        L70:
            java.lang.String r2 = "sigmob"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L79
            goto L90
        L79:
            r10 = 2
            goto L90
        L7b:
            java.lang.String r2 = "pangle"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L84
            goto L90
        L84:
            r10 = 1
            goto L90
        L86:
            java.lang.String r2 = "klevin"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8f
            goto L90
        L8f:
            r10 = 0
        L90:
            switch(r10) {
                case 0: goto Lb0;
                case 1: goto Lad;
                case 2: goto Laa;
                case 3: goto La7;
                case 4: goto La4;
                case 5: goto La1;
                case 6: goto L9e;
                case 7: goto L9b;
                case 8: goto L98;
                case 9: goto L95;
                default: goto L93;
            }
        L93:
            r1 = r0
            goto Lb2
        L95:
            java.lang.String r1 = "com.bytedance.msdk.adapter.mintegral.Mintegral"
            goto Lb2
        L98:
            java.lang.String r1 = "com.bytedance.msdk.adapter.unity.Unity"
            goto Lb2
        L9b:
            java.lang.String r1 = "com.bytedance.msdk.adapter.baidu.Baidu"
            goto Lb2
        L9e:
            java.lang.String r1 = "com.bytedance.msdk.adapter.admob.Admob"
            goto Lb2
        La1:
            java.lang.String r1 = "com.bytedance.msdk.adapter.gdt.Gdt"
            goto Lb2
        La4:
            java.lang.String r1 = "com.bytedance.msdk.adapter.ks.Ks"
            goto Lb2
        La7:
            java.lang.String r1 = "com.bytedance.msdk.adapter.xiaomi.Xiaomi"
            goto Lb2
        Laa:
            java.lang.String r1 = "com.bytedance.msdk.adapter.sigmob.Sigmob"
            goto Lb2
        Lad:
            java.lang.String r1 = "com.bytedance.msdk.adapter.pangle_csjm.Pangle"
            goto Lb2
        Lb0:
            java.lang.String r1 = "com.bytedance.msdk.adapter.klevin.Klevin"
        Lb2:
            int r2 = r14.m()
            int r14 = r14.jy()
            java.lang.String r10 = "BannerLoader"
            java.lang.String r11 = "DrawLoader"
            java.lang.String r12 = "InterstitialLoader"
            java.lang.String r13 = "FullVideoLoader"
            switch(r14) {
                case 1: goto Le2;
                case 2: goto Lc8;
                case 3: goto Le4;
                case 4: goto Lc5;
                case 5: goto Ld8;
                case 6: goto Lc5;
                case 7: goto Ld0;
                case 8: goto Lcc;
                case 9: goto Lce;
                case 10: goto Lc6;
                default: goto Lc5;
            }
        Lc5:
            goto Le6
        Lc6:
            if (r2 != r9) goto Lca
        Lc8:
            r0 = r12
            goto Le6
        Lca:
            if (r2 != r8) goto Le6
        Lcc:
            r0 = r13
            goto Le6
        Lce:
            r0 = r11
            goto Le6
        Ld0:
            java.lang.String r0 = "RewardLoader"
            if (r2 != r4) goto Ld5
            goto Le6
        Ld5:
            if (r2 != r3) goto Le6
            goto Lcc
        Ld8:
            java.lang.String r0 = "NativeLoader"
            if (r2 != r6) goto Ldd
            goto Le6
        Ldd:
            if (r2 != r5) goto Le0
            goto Lce
        Le0:
            if (r2 != r7) goto Le6
        Le2:
            r0 = r10
            goto Le6
        Le4:
            java.lang.String r0 = "SplashLoader"
        Le6:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            return r14
    }

    public static java.util.Comparator<com.bytedance.msdk.xt.cw> xt() {
            com.bytedance.msdk.core.ae.cw$1 r0 = new com.bytedance.msdk.core.ae.cw$1
            r0.<init>()
            com.bytedance.msdk.core.ae.cw.j = r0
            return r0
    }

    public static boolean xt(java.lang.String r0) {
            r0 = 1
            return r0
    }

    private static boolean xt(java.lang.String r4, com.bytedance.msdk.xt.cw r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            int r2 = r5.om()
            r3 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r1 = r1.j(r4, r2, r3)
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            int r5 = r5.om()
            boolean r4 = r2.xt(r4, r5)
            if (r4 == 0) goto L44
            if (r1 == 0) goto L44
            java.util.List r4 = r1.gq()
            if (r4 == 0) goto L44
            java.util.List r4 = r1.gq()
            int r4 = r4.size()
            if (r4 <= 0) goto L44
            java.util.Map r4 = r1.ch()
            if (r4 == 0) goto L44
            java.util.Map r4 = r1.ch()
            int r4 = r4.size()
            if (r4 <= 0) goto L44
            r4 = 1
            return r4
        L44:
            return r0
    }
}
