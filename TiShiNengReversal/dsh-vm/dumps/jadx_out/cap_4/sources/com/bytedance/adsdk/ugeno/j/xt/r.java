package com.bytedance.adsdk.ugeno.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.adsdk.ugeno.j.xt.j {
    private java.util.List<android.animation.Keyframe> tl;

    /* renamed from: com.bytedance.adsdk.ugeno.j.xt.r$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                com.bytedance.adsdk.ugeno.j.up[] r0 = com.bytedance.adsdk.ugeno.j.up.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.ugeno.j.xt.r.AnonymousClass1.j = r0
                com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.j     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.ugeno.j.xt.r.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.ugeno.j.up r1 = com.bytedance.adsdk.ugeno.j.up.ae     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public r(android.content.Context r1, com.bytedance.adsdk.ugeno.xt.cw r2, java.lang.String r3, java.util.Map<java.lang.Float, java.lang.String> r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.tl = r1
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public void j(float r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L7
            goto L13
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L33
            r0.<init>(r5)     // Catch: org.json.JSONException -> L33
            int r5 = r0.length()     // Catch: org.json.JSONException -> L33
            r1 = 2
            if (r5 == r1) goto L14
        L13:
            return
        L14:
            r5 = 0
            double r1 = r0.optDouble(r5)     // Catch: org.json.JSONException -> L33
            float r5 = (float) r1     // Catch: org.json.JSONException -> L33
            r1 = 1
            double r0 = r0.optDouble(r1)     // Catch: org.json.JSONException -> L33
            float r0 = (float) r0     // Catch: org.json.JSONException -> L33
            com.bytedance.adsdk.ugeno.j.up r1 = r3.f1971r     // Catch: org.json.JSONException -> L33
            com.bytedance.adsdk.ugeno.j.up r2 = com.bytedance.adsdk.ugeno.j.up.j     // Catch: org.json.JSONException -> L33
            if (r1 != r2) goto L35
            android.content.Context r1 = r3.j     // Catch: org.json.JSONException -> L33
            float r5 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r5)     // Catch: org.json.JSONException -> L33
            android.content.Context r1 = r3.j     // Catch: org.json.JSONException -> L33
            float r0 = com.bytedance.adsdk.ugeno.m.tl.j(r1, r0)     // Catch: org.json.JSONException -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L48
        L35:
            android.animation.Keyframe r5 = android.animation.Keyframe.ofFloat(r4, r5)     // Catch: org.json.JSONException -> L33
            java.util.List<android.animation.Keyframe> r1 = r3.up     // Catch: org.json.JSONException -> L33
            r1.add(r5)     // Catch: org.json.JSONException -> L33
            android.animation.Keyframe r4 = android.animation.Keyframe.ofFloat(r4, r0)     // Catch: org.json.JSONException -> L33
            java.util.List<android.animation.Keyframe> r5 = r3.tl     // Catch: org.json.JSONException -> L33
            r5.add(r4)     // Catch: org.json.JSONException -> L33
            return
        L48:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public android.animation.TypeEvaluator m() {
            r1 = this;
            android.animation.FloatEvaluator r0 = new android.animation.FloatEvaluator
            r0.<init>()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public java.util.List<android.animation.PropertyValuesHolder> up() {
            r5 = this;
            com.bytedance.adsdk.ugeno.j.up r0 = r5.f1971r
            java.lang.String r0 = r0.xt()
            r5.r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = "X"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.List<android.animation.Keyframe> r2 = r5.up
            r3 = 0
            android.animation.Keyframe[] r4 = new android.animation.Keyframe[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            android.animation.Keyframe[] r2 = (android.animation.Keyframe[]) r2
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r1, r2)
            java.util.List<android.animation.PropertyValuesHolder> r2 = r5.f1970m
            r2.add(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "Y"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.util.List<android.animation.Keyframe> r2 = r5.tl
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            android.animation.Keyframe[] r2 = (android.animation.Keyframe[]) r2
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r0, r2)
            java.util.List<android.animation.PropertyValuesHolder> r2 = r5.f1970m
            r2.add(r0)
            android.animation.TypeEvaluator r2 = r5.m()
            if (r2 == 0) goto L5e
            r1.setEvaluator(r2)
            r0.setEvaluator(r2)
        L5e:
            java.util.List<android.animation.PropertyValuesHolder> r0 = r5.f1970m
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.xt.j
    public void xt() {
            r3 = this;
            int[] r0 = com.bytedance.adsdk.ugeno.j.xt.r.AnonymousClass1.j
            com.bytedance.adsdk.ugeno.j.up r1 = r3.f1971r
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L29
            r1 = 2
            if (r0 == r1) goto L14
            r0 = 0
            r1 = r0
            goto L3d
        L14:
            com.bytedance.adsdk.ugeno.xt.cw r0 = r3.ae
            float r0 = r0.az()
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r2, r0)
            com.bytedance.adsdk.ugeno.xt.cw r1 = r3.ae
            float r1 = r1.av()
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r2, r1)
            goto L3d
        L29:
            com.bytedance.adsdk.ugeno.xt.cw r0 = r3.ae
            float r0 = r0.jy()
            android.animation.Keyframe r0 = android.animation.Keyframe.ofFloat(r2, r0)
            com.bytedance.adsdk.ugeno.xt.cw r1 = r3.ae
            float r1 = r1.ws()
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r2, r1)
        L3d:
            if (r0 == 0) goto L44
            java.util.List<android.animation.Keyframe> r2 = r3.up
            r2.add(r0)
        L44:
            if (r1 == 0) goto L4b
            java.util.List<android.animation.Keyframe> r0 = r3.tl
            r0.add(r1)
        L4b:
            return
    }
}
