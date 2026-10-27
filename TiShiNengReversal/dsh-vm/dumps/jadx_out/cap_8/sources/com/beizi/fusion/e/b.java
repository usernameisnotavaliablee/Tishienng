package com.beizi.fusion.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r1) {
            r0 = -1
            if (r1 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = b(r1)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    public static com.beizi.fusion.model.AdSpacesBean.BuyerBean a(java.lang.String r5, java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r6, java.lang.String r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buyerBeans != null ? "
            r0.append(r1)
            r1 = 0
            if (r6 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r2, r0)
            if (r6 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "buyerBeans.size() = "
            r0.append(r3)
            int r3 = r6.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.beizi.fusion.tool.aa.c(r2, r0)
        L36:
            if (r6 == 0) goto L82
            int r0 = r6.size()
            if (r0 <= 0) goto L82
        L3e:
            int r0 = r6.size()
            if (r1 >= r0) goto L82
            java.lang.Object r0 = r6.get(r1)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AdBuyer buyerBean.getUuid() = "
            r3.append(r4)
            java.lang.String r4 = r0.getBuyerSpaceUuId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.beizi.fusion.tool.aa.c(r2, r3)
            java.lang.String r3 = r0.getId()
            if (r3 == 0) goto L7f
            java.lang.String r3 = r0.getId()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L7f
            if (r7 == 0) goto L7f
            java.lang.String r3 = r0.getBuyerSpaceUuId()
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 == 0) goto L7f
            return r0
        L7f:
            int r1 = r1 + 1
            goto L3e
        L82:
            r5 = 0
            return r5
    }

    public static java.lang.String a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderRulesBean> r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r7.size()     // Catch: java.lang.Exception -> L5c
            if (r1 != 0) goto Lb
            return r0
        Lb:
            r1 = 0
            r2 = 0
        Ld:
            int r3 = r7.size()     // Catch: java.lang.Exception -> L5c
            if (r2 >= r3) goto L5c
            java.lang.Object r3 = r7.get(r2)     // Catch: java.lang.Exception -> L5c
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderRulesBean r3 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderRulesBean) r3     // Catch: java.lang.Exception -> L5c
            if (r3 == 0) goto L59
            java.lang.Integer[] r4 = r3.getResults()     // Catch: java.lang.Exception -> L5c
            if (r4 == 0) goto L59
            int r5 = r4.length     // Catch: java.lang.Exception -> L5c
            r6 = 2
            if (r5 < r6) goto L59
            r5 = r4[r1]     // Catch: java.lang.Exception -> L5c
            int r5 = r5.intValue()     // Catch: java.lang.Exception -> L5c
            if (r8 < r5) goto L59
            r5 = 1
            r4 = r4[r5]     // Catch: java.lang.Exception -> L5c
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L5c
            if (r8 > r4) goto L59
            java.lang.String r7 = r3.getType()     // Catch: java.lang.Exception -> L5c
            java.lang.String r1 = "BeiZis"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
            r2.<init>()     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = "type = "
            r2.append(r3)     // Catch: java.lang.Exception -> L5c
            r2.append(r7)     // Catch: java.lang.Exception -> L5c
            java.lang.String r3 = ";holderNum:"
            r2.append(r3)     // Catch: java.lang.Exception -> L5c
            r2.append(r8)     // Catch: java.lang.Exception -> L5c
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Exception -> L5c
            com.beizi.fusion.tool.aa.c(r1, r8)     // Catch: java.lang.Exception -> L5c
            return r7
        L59:
            int r2 = r2 + 1
            goto Ld
        L5c:
            return r0
    }

    public static java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r4, java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r5, java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L76
            if (r5 == 0) goto L76
            int r1 = r5.size()
            if (r1 != 0) goto L11
            goto L76
        L11:
            java.lang.String r1 = r4.getContent()
            if (r1 != 0) goto L18
            goto L76
        L18:
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case -938285885: goto L4d;
                case 3135262: goto L42;
                case 3529469: goto L37;
                case 94750088: goto L2c;
                case 1095692943: goto L21;
                default: goto L20;
            }
        L20:
            goto L57
        L21:
            java.lang.String r2 = "request"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2a
            goto L57
        L2a:
            r3 = 4
            goto L57
        L2c:
            java.lang.String r2 = "click"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L35
            goto L57
        L35:
            r3 = 3
            goto L57
        L37:
            java.lang.String r2 = "show"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L40
            goto L57
        L40:
            r3 = 2
            goto L57
        L42:
            java.lang.String r2 = "fail"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4b
            goto L57
        L4b:
            r3 = 1
            goto L57
        L4d:
            java.lang.String r2 = "random"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            switch(r3) {
                case 0: goto L73;
                case 1: goto L6d;
                case 2: goto L67;
                case 3: goto L61;
                case 4: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L76
        L5b:
            java.lang.String r1 = "200.000"
            a(r4, r5, r6, r0, r1)
            return r0
        L61:
            java.lang.String r1 = "290.300"
            a(r4, r5, r6, r0, r1)
            return r0
        L67:
            java.lang.String r1 = "280.300"
            a(r4, r5, r6, r0, r1)
            return r0
        L6d:
            java.lang.String r1 = "280.500"
            a(r4, r5, r6, r0, r1)
            return r0
        L73:
            a(r4, r0)
        L76:
            return r0
    }

    public static void a(android.content.Context r13, long r14, com.beizi.fusion.model.AdSpacesBean.FilterBean r16, com.beizi.fusion.events.b r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.beizi.fusion.c.a r21) {
            r0 = r17
            r1 = r19
            r2 = r21
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "channel = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ",observer.mPlatformFilterStatus.getStatus() = "
            r3.append(r4)
            com.beizi.fusion.events.a$k r4 = r0.c
            int r4 = r4.a()
            r3.append(r4)
            java.lang.String r4 = ",observer.mChannelFilterStatus.getStatus(channelId) = "
            r3.append(r4)
            com.beizi.fusion.events.a$d r4 = r0.e
            int r4 = r4.a(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r4, r3)
        L3a:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le1
            com.beizi.fusion.events.a$k r4 = r0.c
            int r4 = r4.a()
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L52
            com.beizi.fusion.events.a$d r4 = r0.e
            int r4 = r4.a(r1)
            if (r4 != r5) goto Le1
        L52:
            r2 = 3
            if (r16 == 0) goto L8a
            java.util.List r4 = r16.getPrivilege()
            if (r4 == 0) goto L66
            int r7 = r4.size()
            if (r7 <= 0) goto L66
            boolean r13 = a(r13, r4)
            goto L67
        L66:
            r13 = 1
        L67:
            int r4 = r16.getMinAdLoadTime()
            long r7 = (long) r4
            r4 = 0
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 <= 0) goto L73
            r7 = 1
            goto L74
        L73:
            r7 = 0
        L74:
            java.util.List r8 = r16.getFrequency()     // Catch: java.lang.Exception -> L85
            java.lang.String r9 = c(r1)     // Catch: java.lang.Exception -> L85
            r10 = r18
            r11 = r20
            boolean r6 = com.beizi.fusion.tool.s.a(r8, r10, r9, r11)     // Catch: java.lang.Exception -> L85
            goto L86
        L85:
        L86:
            r12 = r6
            r6 = r13
            r13 = r12
            goto L9a
        L8a:
            if (r3 != 0) goto L92
            com.beizi.fusion.events.a$d r13 = r0.e
            r13.a(r1, r2)
            goto L97
        L92:
            com.beizi.fusion.events.a$k r13 = r0.c
            r13.a(r5)
        L97:
            r13 = 1
            r4 = 1
            r7 = 1
        L9a:
            r8 = 5
            if (r6 != 0) goto Lab
            if (r3 != 0) goto La5
            com.beizi.fusion.events.a$d r9 = r0.e
            r9.a(r1, r8)
            goto Lab
        La5:
            com.beizi.fusion.events.a$k r9 = r0.c
            r10 = 4
            r9.a(r10)
        Lab:
            r9 = 6
            if (r7 != 0) goto Lbb
            if (r3 != 0) goto Lb6
            com.beizi.fusion.events.a$d r8 = r0.e
            r8.a(r1, r9)
            goto Lbb
        Lb6:
            com.beizi.fusion.events.a$k r10 = r0.c
            r10.a(r8)
        Lbb:
            if (r13 != 0) goto Lcb
            if (r3 != 0) goto Lc6
            com.beizi.fusion.events.a$d r8 = r0.e
            r9 = 7
            r8.a(r1, r9)
            goto Lcb
        Lc6:
            com.beizi.fusion.events.a$k r8 = r0.c
            r8.a(r9)
        Lcb:
            if (r4 != 0) goto Lfb
            if (r6 == 0) goto Lfb
            if (r7 == 0) goto Lfb
            if (r13 == 0) goto Lfb
            if (r3 != 0) goto Ldb
            com.beizi.fusion.events.a$d r13 = r0.e
            r13.a(r1, r2)
            goto Lfb
        Ldb:
            com.beizi.fusion.events.a$k r13 = r0.c
            r13.a(r5)
            goto Lfb
        Le1:
            if (r0 == 0) goto Lf2
            r13 = -2
            if (r3 != 0) goto Lec
            com.beizi.fusion.events.a$d r0 = r0.e
            r0.a(r1, r13)
            return
        Lec:
            com.beizi.fusion.events.a$k r0 = r0.c
            r0.a(r13)
            return
        Lf2:
            if (r2 == 0) goto Lfb
            if (r3 == 0) goto Lfb
            java.lang.String r13 = "status not PlatformFilterStatus.kPlatformFilterStatusBegin"
            r2.a(r13)
        Lfb:
            return
    }

    protected static void a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r11, java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> r12) {
            java.util.List r11 = r11.getForward()
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r0 = (int) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdForward random:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r2, r1)
            if (r11 == 0) goto L79
            int r1 = r11.size()
            if (r1 <= 0) goto L79
            int r1 = r11.size()
            r2 = 0
            r3 = 0
        L34:
            if (r3 >= r1) goto L79
            java.lang.Object r4 = r11.get(r3)
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r4 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r4
            java.util.List r5 = r4.getRules()
            if (r5 == 0) goto L76
            int r6 = r5.size()
            if (r6 <= 0) goto L76
            int r6 = r5.size()
            r7 = 0
        L4d:
            if (r7 >= r6) goto L76
            java.lang.Object r8 = r5.get(r7)
            com.beizi.fusion.model.AdSpacesBean$RulesBean r8 = (com.beizi.fusion.model.AdSpacesBean.RulesBean) r8
            java.lang.Integer[] r8 = r8.getResults()
            if (r8 == 0) goto L73
            int r9 = r8.length
            r10 = 2
            if (r9 < r10) goto L73
            r9 = r8[r2]
            int r9 = r9.intValue()
            r10 = 1
            r8 = r8[r10]
            int r8 = r8.intValue()
            if (r9 > r0) goto L73
            if (r0 > r8) goto L73
            r12.add(r4)
        L73:
            int r7 = r7 + 1
            goto L4d
        L76:
            int r3 = r3 + 1
            goto L34
        L79:
            return
    }

    private static void a(com.beizi.fusion.model.AdSpacesBean.ComponentBean r7, java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r8, java.lang.String r9, java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> r10, java.lang.String r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter handleSpaceStrategyByEvent eventCode = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r1, r0)
            java.util.List r7 = r7.getForward()
            if (r7 == 0) goto Lb8
            int r0 = r7.size()
            if (r0 <= 0) goto Lb8
            int r9 = com.beizi.fusion.tool.s.a(r9, r11)
            java.lang.String r0 = "200.000"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L2f
            goto L31
        L2f:
            int r9 = r9 + 1
        L31:
            r11 = 0
            r0 = 0
        L33:
            int r2 = r7.size()
            if (r0 >= r2) goto Lb8
            java.lang.Object r2 = r7.get(r0)
            com.beizi.fusion.model.AdSpacesBean$ForwardBean r2 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r2
            r3 = 0
        L40:
            int r4 = r8.size()
            if (r3 >= r4) goto Lb4
            java.lang.Object r4 = r8.get(r3)
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r4 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean) r4
            java.lang.String r5 = r4.getId()
            if (r5 == 0) goto Lb1
            java.lang.String r5 = r4.getId()
            java.lang.String r6 = r2.getBuyerId()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto Lb1
            java.lang.String r5 = r4.getBuyerSpaceUuId()
            if (r5 == 0) goto Lb1
            java.lang.String r4 = r4.getBuyerSpaceUuId()
            java.lang.String r5 = r2.getBuyerSpaceUuId()
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto Lb1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.getBuyerId()
            r4.append(r5)
            java.lang.String r5 = " handleSpaceRequestStrategy buyerBean match"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.beizi.fusion.tool.aa.c(r1, r4)
            java.util.List r4 = r2.getRules()
            boolean r4 = b(r4, r9)
            if (r4 == 0) goto Lb1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.getBuyerId()
            r4.append(r5)
            java.lang.String r5 = " enter rulesMatch"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.beizi.fusion.tool.aa.c(r1, r4)
            r10.add(r2)
        Lb1:
            int r3 = r3 + 1
            goto L40
        Lb4:
            int r0 = r0 + 1
            goto L33
        Lb8:
            return
    }

    private static boolean a(android.content.Context r3, java.util.List<java.lang.String> r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r0.checkPermission(r1, r3)
            r2 = -1
            if (r2 != r1) goto Lc
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    private static boolean a(com.beizi.fusion.model.AdSpacesBean.RulesBean r7, int r8) {
            java.lang.String r0 = "BeiZis"
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = r7.getFormula()     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "x"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r4.<init>()     // Catch: java.lang.Exception -> L96
            r4.append(r8)     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = ""
            r4.append(r5)     // Catch: java.lang.Exception -> L96
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> L96
            int r3 = com.beizi.fusion.e.c.a(r2)     // Catch: java.lang.Exception -> L96
            java.lang.Integer[] r4 = r7.getResults()     // Catch: java.lang.Exception -> L96
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r5.<init>()     // Catch: java.lang.Exception -> L96
            java.lang.String r6 = "formulaOrig = "
            r5.append(r6)     // Catch: java.lang.Exception -> L96
            r5.append(r2)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = ",isOneRuleMatch holderNum = "
            r5.append(r2)     // Catch: java.lang.Exception -> L96
            r5.append(r8)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Exception -> L96
            com.beizi.fusion.tool.aa.c(r0, r2)     // Catch: java.lang.Exception -> L96
            if (r4 == 0) goto L85
            int r2 = r4.length     // Catch: java.lang.Exception -> L96
            r5 = 2
            if (r2 < r5) goto L85
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r2.<init>()     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = "formulaResult = "
            r2.append(r5)     // Catch: java.lang.Exception -> L96
            r2.append(r3)     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = ",results[0] = "
            r2.append(r5)     // Catch: java.lang.Exception -> L96
            r5 = r4[r1]     // Catch: java.lang.Exception -> L96
            r2.append(r5)     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = ",results[1] = "
            r2.append(r5)     // Catch: java.lang.Exception -> L96
            r5 = 1
            r6 = r4[r5]     // Catch: java.lang.Exception -> L96
            r2.append(r6)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L96
            com.beizi.fusion.tool.aa.c(r0, r2)     // Catch: java.lang.Exception -> L96
            r2 = r4[r1]     // Catch: java.lang.Exception -> L96
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L96
            if (r3 < r2) goto L85
            r2 = r4[r5]     // Catch: java.lang.Exception -> L96
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L96
            if (r3 > r2) goto L85
            r1 = 1
        L85:
            java.util.List r2 = r7.getRules()     // Catch: java.lang.Exception -> L96
            if (r2 == 0) goto L95
            java.util.List r7 = r7.getRules()     // Catch: java.lang.Exception -> L96
            boolean r7 = b(r7, r8)     // Catch: java.lang.Exception -> L96
            r7 = r7 & r1
            return r7
        L95:
            return r1
        L96:
            java.lang.String r7 = "execute formula error!"
            com.beizi.fusion.tool.aa.c(r0, r7)
            return r1
    }

    public static java.lang.String b(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = com.beizi.fusion.tool.ao.b()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L23
            java.lang.String r1 = "BEIZI"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L17
            goto L23
        L17:
            java.lang.String r1 = "ADSCOPE"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L20
            return r0
        L20:
            java.lang.String r2 = "8888"
            return r2
        L23:
            java.lang.String r2 = "6666"
            return r2
    }

    private static boolean b(java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> r4, int r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 1
            if (r1 != 0) goto L14
            java.lang.String r1 = "BeiZis"
            java.lang.String r3 = "enter rulesBeanList.size() == 0"
            com.beizi.fusion.tool.aa.c(r1, r3)
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            int r3 = r4.size()
            if (r0 >= r3) goto L2b
            java.lang.Object r3 = r4.get(r0)
            com.beizi.fusion.model.AdSpacesBean$RulesBean r3 = (com.beizi.fusion.model.AdSpacesBean.RulesBean) r3
            boolean r3 = a(r3, r5)
            if (r3 == 0) goto L28
            return r2
        L28:
            int r0 = r0 + 1
            goto L15
        L2b:
            return r1
    }

    private static java.lang.String c(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "enter convertSelfChannel buyerId = "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L1e
            r2 = 0
            return r2
        L1e:
            java.lang.String r0 = com.beizi.fusion.tool.ao.b()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "BEIZI"
        L2a:
            return r2
    }
}
