package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tj extends java.util.HashMap<java.lang.String, java.lang.Object> {
    public tj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean j(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "[A-Za-z0-9-_]{1,100}"
            boolean r1 = r1.matches(r0)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @androidx.annotation.Nullable
    public java.lang.Object get(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = "gm_usb"
            boolean r0 = r0.equals(r4)
            java.lang.String r1 = "接口获取无权限，请联系商务开通"
            if (r0 == 0) goto L1d
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r2 = 1
            r0.j(r2)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.uf()
            if (r0 != 0) goto L4b
            return r1
        L1d:
            java.lang.String r0 = "gm_policy"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L4b
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 != 0) goto L30
            return r1
        L30:
            java.lang.String r0 = "prime_rit"
            java.lang.Object r0 = r3.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4b
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.xt.xt r1 = r1.gx()
            if (r1 == 0) goto L4b
            org.json.JSONObject r4 = r1.j(r0, r3)
            return r4
        L4b:
            java.lang.Object r4 = super.get(r4)
            return r4
    }

    @Override // java.util.HashMap, java.util.Map
    @androidx.annotation.Nullable
    public java.lang.Object getOrDefault(@androidx.annotation.Nullable java.lang.Object r1, @androidx.annotation.Nullable java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            return r2
    }

    @androidx.annotation.Nullable
    public java.lang.Object j(java.lang.String r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r0 = "gm_usb"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L1e
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.uf()
            if (r0 != 0) goto L19
            java.lang.String r9 = "接口获取无权限，请联系商务开通"
            java.lang.Object r8 = super.put(r8, r9)
            return r8
        L19:
            java.lang.Object r8 = super.put(r8, r9)
            return r8
        L1e:
            java.lang.String r0 = "usePolicy"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L9d
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ed()
            if (r0 == 0) goto L9d
            boolean r0 = r9 instanceof org.json.JSONObject
            if (r0 == 0) goto L9d
            r0 = r9
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.util.Iterator r1 = r0.keys()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.bytedance.msdk.core.j r3 = com.bytedance.msdk.core.j.qv()
            java.util.Map r3 = r3.r()
            boolean r3 = r3.containsKey(r2)
            java.lang.String r4 = "TTMediationSDK"
            if (r3 != 0) goto L6e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "KEY_USE_POLICY的adLoad参数中存在不合法key："
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = "，该key将被移除，如需要自定义key 请通过 KEY_USE_POLICY 中的 KEY_USE_POLICY_OBJ_CUSTOM 实现"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r2)
            goto L3b
        L6e:
            java.lang.Object r3 = r0.opt(r2)
            if (r3 == 0) goto L3b
            java.lang.String r5 = java.lang.String.valueOf(r3)
            boolean r5 = j(r5)
            if (r5 != 0) goto L3b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "adLoad参数中key为 "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " 字段的值，"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = " 存在不合法输入"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.bytedance.sdk.component.utils.vl.r(r4, r2)
            goto L3b
        L9d:
            java.lang.Object r8 = super.put(r8, r9)
            return r8
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @androidx.annotation.Nullable
    public /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.j(r1, r2)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@androidx.annotation.NonNull java.util.Map<? extends java.lang.String, ?> r3) {
            r2 = this;
            if (r3 == 0) goto L2a
            int r0 = r3.size()
            if (r0 <= 0) goto L2a
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.j(r1, r0)
            goto L10
        L2a:
            return
    }
}
