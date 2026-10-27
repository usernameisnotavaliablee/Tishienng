package xyz.adscope.common.json.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class FieldUtil {
    public FieldUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void fillField(org.json.JSONObject r5, java.lang.Object r6, java.lang.reflect.Field r7) {
            if (r5 == 0) goto Lb7
            if (r6 == 0) goto Lb7
            java.lang.String r0 = "{}"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lb7
            if (r7 != 0) goto L10
            goto Lb7
        L10:
            java.lang.Class r0 = r7.getType()     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Exception -> La0
            boolean r2 = r5.has(r1)     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r5.get(r1)     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto Lb7
            r3 = 0
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> La0
            if (r3 != 0) goto Lb7
            boolean r3 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r0)     // Catch: java.lang.Exception -> La0
            if (r3 == 0) goto L61
            r5.remove(r1)     // Catch: java.lang.Exception -> La0
            boolean r5 = xyz.adscope.common.json.util.TypeUtil.isWrapType(r0)     // Catch: java.lang.Exception -> La0
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r5 != 0) goto L47
            boolean r5 = r1.isAssignableFrom(r0)     // Catch: java.lang.Exception -> La0
            if (r5 == 0) goto L43
            goto L47
        L43:
            r7.set(r6, r2)     // Catch: java.lang.Exception -> La0
            return
        L47:
            r5 = 1
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> La0
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Exception -> La0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> La0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> La0
            r5[r4] = r1     // Catch: java.lang.Exception -> La0
            java.lang.Object r5 = r0.newInstance(r5)     // Catch: java.lang.Exception -> La0
            r7.set(r6, r5)     // Catch: java.lang.Exception -> La0
            return
        L61:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r0)     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto L79
            org.json.JSONArray r5 = r5.getJSONArray(r1)     // Catch: java.lang.Exception -> La0
            java.lang.reflect.Type r1 = r7.getGenericType()     // Catch: java.lang.Exception -> La0
            java.util.List r5 = xyz.adscope.common.json.util.JsonUtil.jsonArrayToList(r5, r0, r1)     // Catch: java.lang.Exception -> La0
            r7.set(r6, r5)     // Catch: java.lang.Exception -> La0
            return
        L79:
            boolean r2 = r0.isArray()     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto L8d
            org.json.JSONArray r5 = r5.getJSONArray(r1)     // Catch: java.lang.Exception -> La0
            java.lang.Object r5 = xyz.adscope.common.json.util.JsonUtil.jsonArrayToArray(r5, r0)     // Catch: java.lang.Exception -> La0
            if (r5 == 0) goto Lb7
            r7.set(r6, r5)     // Catch: java.lang.Exception -> La0
            return
        L8d:
            java.lang.String r2 = "FiledUtil"
            java.lang.String r3 = "fieldClazz bean type "
            xyz.adscope.common.tool.LogUtil.i(r2, r3)     // Catch: java.lang.Exception -> La0
            org.json.JSONObject r5 = r5.getJSONObject(r1)     // Catch: java.lang.Exception -> La0
            java.lang.Object r5 = xyz.adscope.common.json.util.JsonUtil.fromJson(r5, r0)     // Catch: java.lang.Exception -> La0
            r7.set(r6, r5)     // Catch: java.lang.Exception -> La0
            return
        La0:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "e : "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r6, r5)
        Lb7:
            return
    }

    public static java.util.List<java.lang.reflect.Field> getAllFields(java.lang.Class<?> r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            if (r3 == 0) goto L20
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.reflect.Field[] r2 = r3.getDeclaredFields()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            r0.addAll(r1)
            java.lang.Class r3 = r3.getSuperclass()
            goto L9
        L20:
            return r0
    }
}
