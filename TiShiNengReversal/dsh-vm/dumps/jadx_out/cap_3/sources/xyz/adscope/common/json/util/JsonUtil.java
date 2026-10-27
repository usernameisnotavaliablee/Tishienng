package xyz.adscope.common.json.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JsonUtil {
    public JsonUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(org.json.JSONObject r5, java.lang.Object r6, java.lang.reflect.Field r7) {
            java.lang.Class r0 = r7.getType()     // Catch: java.lang.Exception -> Ld8
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Exception -> Ld8
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> Ld8
            if (r6 == 0) goto Ld7
            r7 = 0
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Exception -> Ld8
            if (r7 != 0) goto Ld7
            boolean r7 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r0)     // Catch: java.lang.Exception -> Ld8
            if (r7 == 0) goto L25
            boolean r7 = r5.has(r1)     // Catch: java.lang.Exception -> Ld8
            if (r7 != 0) goto Ld7
            r5.put(r1, r6)     // Catch: java.lang.Exception -> Ld8
            return
        L25:
            java.lang.Class<java.util.List> r7 = java.util.List.class
            boolean r7 = r7.isAssignableFrom(r0)     // Catch: java.lang.Exception -> Ld8
            if (r7 == 0) goto L69
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Exception -> Ld8
            r7.<init>()     // Catch: java.lang.Exception -> Ld8
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> Ld8
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> Ld8
        L38:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> Ld8
            if (r0 == 0) goto L65
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> Ld8
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Exception -> Ld8
            boolean r2 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r2)     // Catch: java.lang.Exception -> Ld8
            if (r2 == 0) goto L50
            r7.put(r0)     // Catch: java.lang.Exception -> Ld8
            goto L38
        L50:
            boolean r2 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            if (r2 == 0) goto L58
            r7.put(r0)     // Catch: java.lang.Exception -> Ld8
            goto L38
        L58:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            java.lang.String r0 = toJson(r0)     // Catch: java.lang.Exception -> Ld8
            r2.<init>(r0)     // Catch: java.lang.Exception -> Ld8
            r7.put(r2)     // Catch: java.lang.Exception -> Ld8
            goto L38
        L65:
            r5.put(r1, r7)     // Catch: java.lang.Exception -> Ld8
            return
        L69:
            boolean r7 = r0.isArray()     // Catch: java.lang.Exception -> Ld8
            if (r7 == 0) goto La5
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Exception -> Ld8
            r7.<init>()     // Catch: java.lang.Exception -> Ld8
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Exception -> Ld8
            int r0 = r6.length     // Catch: java.lang.Exception -> Ld8
            r2 = 0
        L78:
            if (r2 >= r0) goto La1
            r3 = r6[r2]     // Catch: java.lang.Exception -> Ld8
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> Ld8
            boolean r4 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r4)     // Catch: java.lang.Exception -> Ld8
            if (r4 == 0) goto L8a
            r7.put(r3)     // Catch: java.lang.Exception -> Ld8
            goto L9e
        L8a:
            boolean r4 = r3 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            if (r4 == 0) goto L92
            r7.put(r3)     // Catch: java.lang.Exception -> Ld8
            goto L9e
        L92:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            java.lang.String r3 = toJson(r3)     // Catch: java.lang.Exception -> Ld8
            r4.<init>(r3)     // Catch: java.lang.Exception -> Ld8
            r7.put(r4)     // Catch: java.lang.Exception -> Ld8
        L9e:
            int r2 = r2 + 1
            goto L78
        La1:
            r5.put(r1, r7)     // Catch: java.lang.Exception -> Ld8
            return
        La5:
            java.lang.Class<org.json.JSONObject> r7 = org.json.JSONObject.class
            boolean r7 = r7.isAssignableFrom(r0)     // Catch: java.lang.Exception -> Ld8
            if (r7 == 0) goto Lcb
            boolean r7 = r6 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            if (r7 == 0) goto Ld7
            r5.put(r1, r6)     // Catch: java.lang.Exception -> Ld8
            java.lang.String r5 = "JsonUtil"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld8
            r7.<init>()     // Catch: java.lang.Exception -> Ld8
            java.lang.String r0 = "valueJsonObject "
            r7.append(r0)     // Catch: java.lang.Exception -> Ld8
            r7.append(r6)     // Catch: java.lang.Exception -> Ld8
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Exception -> Ld8
            xyz.adscope.common.tool.LogUtil.i(r5, r6)     // Catch: java.lang.Exception -> Ld8
            return
        Lcb:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld8
            java.lang.String r6 = toJson(r6)     // Catch: java.lang.Exception -> Ld8
            r7.<init>(r6)     // Catch: java.lang.Exception -> Ld8
            r5.put(r1, r7)     // Catch: java.lang.Exception -> Ld8
        Ld7:
            return
        Ld8:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "e : "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r6, r5)
            return
    }

    public static java.lang.String addEscapeChar(java.lang.String r5) {
            java.lang.String r0 = ""
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        Lb:
            int r3 = r5.length()
            if (r2 >= r3) goto L4d
            char r3 = r5.charAt(r2)
            r4 = 9
            if (r3 == r4) goto L45
            r4 = 10
            if (r3 == r4) goto L3f
            r4 = 13
            if (r3 == r4) goto L39
            r4 = 34
            if (r3 == r4) goto L33
            r4 = 92
            if (r3 == r4) goto L2d
            r1.append(r3)
            goto L4a
        L2d:
            java.lang.String r3 = "\\\\"
            r1.append(r3)
            goto L4a
        L33:
            java.lang.String r3 = "\\\""
            r1.append(r3)
            goto L4a
        L39:
            java.lang.String r3 = "\\r"
            r1.append(r3)
            goto L4a
        L3f:
            java.lang.String r3 = "\\n"
            r1.append(r3)
            goto L4a
        L45:
            java.lang.String r3 = "\\t"
            r1.append(r3)
        L4a:
            int r2 = r2 + 1
            goto Lb
        L4d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.Object r1 = fromJson(r0, r2)
            return r1
    }

    public static <T> T fromJson(org.json.JSONObject r5, java.lang.Class<T> r6) {
            java.lang.String r0 = "common_log"
            java.lang.String r1 = "e : "
            java.lang.Object r2 = r6.newInstance()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            java.util.List r6 = xyz.adscope.common.json.util.FieldUtil.getAllFields(r6)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            if (r6 == 0) goto L3b
            int r3 = r6.size()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            if (r3 <= 0) goto L3b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
        L18:
            boolean r3 = r6.hasNext()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r6.next()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            int r4 = r3.getModifiers()     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            if (r4 != 0) goto L37
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            goto L37
        L33:
            r5 = move-exception
            goto L3c
        L35:
            r5 = move-exception
            goto L4f
        L37:
            xyz.adscope.common.json.util.FieldUtil.fillField(r5, r2, r3)     // Catch: java.lang.InstantiationException -> L33 java.lang.IllegalAccessException -> L35
            goto L18
        L3b:
            return r2
        L3c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r5)
            goto L61
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            xyz.adscope.common.tool.LogUtil.e(r0, r5)
        L61:
            r5 = 0
            return r5
    }

    public static java.lang.Object jsonArrayToArray(org.json.JSONArray r4, java.lang.Class<?> r5) {
            java.lang.Class r5 = r5.getComponentType()     // Catch: java.lang.Exception -> L29
            int r0 = r4.length()     // Catch: java.lang.Exception -> L29
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r5, r0)     // Catch: java.lang.Exception -> L29
            r2 = 0
        Ld:
            if (r2 >= r0) goto L28
            boolean r3 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r5)     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Exception -> L29
            goto L22
        L1a:
            org.json.JSONObject r3 = r4.getJSONObject(r2)     // Catch: java.lang.Exception -> L29
            java.lang.Object r3 = fromJson(r3, r5)     // Catch: java.lang.Exception -> L29
        L22:
            java.lang.reflect.Array.set(r1, r2, r3)     // Catch: java.lang.Exception -> L29
            int r2 = r2 + 1
            goto Ld
        L28:
            return r1
        L29:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "e : "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r5, r4)
            r4 = 0
            return r4
    }

    public static java.util.List<java.lang.Object> jsonArrayToList(org.json.JSONArray r4, java.lang.Class<?> r5, java.lang.reflect.Type r6) {
            r0 = 0
            if (r4 == 0) goto L6d
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L6d
        La:
            boolean r1 = r6 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L6d
            boolean r1 = r5.isInterface()     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L21
            int r1 = r5.getModifiers()     // Catch: java.lang.Exception -> L1f
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L23
            goto L21
        L1f:
            r4 = move-exception
            goto L57
        L21:
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
        L23:
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L1f
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()     // Catch: java.lang.Exception -> L1f
            r1 = 0
            r6 = r6[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Exception -> L1f
            int r2 = r4.length()     // Catch: java.lang.Exception -> L1f
        L38:
            if (r1 >= r2) goto L56
            boolean r3 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r6)     // Catch: java.lang.Exception -> L1f
            if (r3 == 0) goto L48
            java.lang.Object r3 = r4.get(r1)     // Catch: java.lang.Exception -> L1f
            r5.add(r3)     // Catch: java.lang.Exception -> L1f
            goto L53
        L48:
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Object r3 = fromJson(r3, r6)     // Catch: java.lang.Exception -> L1f
            r5.add(r3)     // Catch: java.lang.Exception -> L1f
        L53:
            int r1 = r1 + 1
            goto L38
        L56:
            return r5
        L57:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "e : "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r5, r4)
        L6d:
            return r0
    }

    public static java.lang.String objectToJson(java.lang.Object r5) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L43
            r0.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L43
            java.util.List r1 = xyz.adscope.common.json.util.FieldUtil.getAllFields(r1)     // Catch: java.lang.Exception -> L43
            if (r1 == 0) goto L3e
            int r2 = r1.size()     // Catch: java.lang.Exception -> L43
            if (r2 <= 0) goto L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L43
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L43
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Exception -> L43
            int r3 = r2.getModifiers()     // Catch: java.lang.Exception -> L43
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch: java.lang.Exception -> L43
            if (r3 != 0) goto L3a
            int r3 = r2.getModifiers()     // Catch: java.lang.Exception -> L43
            r4 = 2
            if (r3 != r4) goto L3a
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L43
        L3a:
            a(r0, r5, r2)     // Catch: java.lang.Exception -> L43
            goto L19
        L3e:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L43
            return r5
        L43:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r5)
            r5 = 0
            return r5
    }

    public static org.json.JSONObject objectToJsonObject(java.lang.Object r5) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L3f
            java.util.List r1 = xyz.adscope.common.json.util.FieldUtil.getAllFields(r1)     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L3e
            int r2 = r1.size()     // Catch: java.lang.Exception -> L3f
            if (r2 <= 0) goto L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L3f
        L19:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Exception -> L3f
            int r3 = r2.getModifiers()     // Catch: java.lang.Exception -> L3f
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)     // Catch: java.lang.Exception -> L3f
            if (r3 != 0) goto L3a
            int r3 = r2.getModifiers()     // Catch: java.lang.Exception -> L3f
            r4 = 2
            if (r3 != r4) goto L3a
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L3f
        L3a:
            a(r0, r5, r2)     // Catch: java.lang.Exception -> L3f
            goto L19
        L3e:
            return r0
        L3f:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "e : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r0, r5)
            r5 = 0
            return r5
    }

    public static java.lang.String toJson(java.lang.Object r6) {
            java.lang.String r0 = ""
            if (r6 != 0) goto L5
            return r0
        L5:
            java.lang.Class r1 = r6.getClass()     // Catch: org.json.JSONException -> L14
            boolean r2 = xyz.adscope.common.json.util.TypeUtil.isBasicType(r1)     // Catch: org.json.JSONException -> L14
            if (r2 == 0) goto L16
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L14
            return r6
        L14:
            r6 = move-exception
            goto L71
        L16:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r1)     // Catch: org.json.JSONException -> L14
            if (r2 == 0) goto L45
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L14
            r1.<init>()     // Catch: org.json.JSONException -> L14
            java.util.List r6 = (java.util.List) r6     // Catch: org.json.JSONException -> L14
            java.util.Iterator r6 = r6.iterator()     // Catch: org.json.JSONException -> L14
        L29:
            boolean r2 = r6.hasNext()     // Catch: org.json.JSONException -> L14
            if (r2 == 0) goto L40
            java.lang.Object r2 = r6.next()     // Catch: org.json.JSONException -> L14
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14
            java.lang.String r2 = toJson(r2)     // Catch: org.json.JSONException -> L14
            r3.<init>(r2)     // Catch: org.json.JSONException -> L14
            r1.put(r3)     // Catch: org.json.JSONException -> L14
            goto L29
        L40:
            java.lang.String r6 = r1.toString()     // Catch: org.json.JSONException -> L14
            return r6
        L45:
            boolean r1 = r1.isArray()     // Catch: org.json.JSONException -> L14
            if (r1 == 0) goto L6c
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L14
            r1.<init>()     // Catch: org.json.JSONException -> L14
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: org.json.JSONException -> L14
            int r2 = r6.length     // Catch: org.json.JSONException -> L14
            r3 = 0
        L54:
            if (r3 >= r2) goto L67
            r4 = r6[r3]     // Catch: org.json.JSONException -> L14
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14
            java.lang.String r4 = toJson(r4)     // Catch: org.json.JSONException -> L14
            r5.<init>(r4)     // Catch: org.json.JSONException -> L14
            r1.put(r5)     // Catch: org.json.JSONException -> L14
            int r3 = r3 + 1
            goto L54
        L67:
            java.lang.String r6 = r1.toString()     // Catch: org.json.JSONException -> L14
            return r6
        L6c:
            java.lang.String r6 = objectToJson(r6)     // Catch: org.json.JSONException -> L14
            return r6
        L71:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "e : "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r1, r6)
            return r0
    }
}
