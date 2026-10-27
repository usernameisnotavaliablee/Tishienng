package xyz.adscope.common.v2.tool.json;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JsonUtil {
    private static final java.lang.String TAG = "JsonUtil";

    private JsonUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONArray array2JSONArray(java.lang.Object r5, java.lang.reflect.Type r6) {
            org.json.JSONArray r0 = emptyJSONArray()
            if (r5 == 0) goto L41
            java.lang.Class r1 = r5.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L41
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r1 = r5.length
            if (r1 <= 0) goto L41
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r1 = 0
            r6 = r6[r1]
            java.lang.Class r6 = (java.lang.Class) r6
            int r2 = r5.length
        L21:
            if (r1 >= r2) goto L41
            r3 = r5[r1]
            boolean r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r6)
            if (r4 == 0) goto L2f
            r0.put(r3)
            goto L3e
        L2f:
            java.lang.Class<xyz.adscope.common.v2.model.IJsonMappingModel> r4 = xyz.adscope.common.v2.model.IJsonMappingModel.class
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L3e
            org.json.JSONObject r3 = parseEntry2Json(r3)
            r0.put(r3)
        L3e:
            int r1 = r1 + 1
            goto L21
        L41:
            return r0
    }

    public static org.json.JSONArray emptyJSONArray() {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            return r0
    }

    public static org.json.JSONObject emptyJSONObject() {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            return r0
    }

    public static org.json.JSONObject entry2JsonObject(java.lang.Object r7, boolean r8) {
            java.lang.Class r0 = r7.getClass()
            java.util.List r1 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r0)
            org.json.JSONObject r2 = emptyJSONObject()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<xyz.adscope.common.v2.model.annotation.JsonParseNode> r4 = xyz.adscope.common.v2.model.annotation.JsonParseNode.class
            boolean r5 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isAnnotationType(r3, r4)
            if (r5 == 0) goto L10
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            xyz.adscope.common.v2.model.annotation.JsonParseNode r4 = (xyz.adscope.common.v2.model.annotation.JsonParseNode) r4
            if (r4 == 0) goto L10
            boolean r5 = r4.exclude()
            if (r5 == 0) goto L33
            goto L10
        L33:
            java.lang.Object r5 = parseValue(r7, r3, r8)
            if (r8 == 0) goto L51
            if (r5 == 0) goto L10
            boolean r6 = r5 instanceof java.lang.String     // Catch: org.json.JSONException -> L59
            if (r6 == 0) goto L10
            java.lang.String r6 = r5.toString()     // Catch: org.json.JSONException -> L59
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L59
            if (r6 != 0) goto L10
            java.lang.String r4 = r4.key()     // Catch: org.json.JSONException -> L59
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L59
            goto L10
        L51:
            java.lang.String r4 = r4.key()     // Catch: org.json.JSONException -> L59
            r2.put(r4, r5)     // Catch: org.json.JSONException -> L59
            goto L10
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "转json异常..."
            r4.append(r5)
            java.lang.String r5 = r0.getSimpleName()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r3 = r3.getName()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JsonUtil"
            xyz.adscope.common.v2.log.SDKLog.e(r4, r3)
            goto L10
        L80:
            return r2
    }

    public static java.lang.String entry2JsonString(java.lang.Object r1) {
            r0 = 0
            org.json.JSONObject r1 = entry2JsonObject(r1, r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static int getInt(org.json.JSONObject r1, java.lang.String r2, int r3) {
            if (r1 == 0) goto Ld
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto Ld
            int r1 = r1.getInt(r2)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            return r3
    }

    public static org.json.JSONArray getJSONArray(org.json.JSONObject r1, java.lang.String r2) {
            if (r1 == 0) goto L11
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L11
            org.json.JSONArray r1 = r1.getJSONArray(r2)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L11:
            r1 = 0
            return r1
    }

    public static java.lang.String getJSONArrayStr(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L14
            r0.<init>(r1)     // Catch: org.json.JSONException -> L14
            boolean r1 = r0.has(r2)     // Catch: org.json.JSONException -> L14
            if (r1 == 0) goto L18
            org.json.JSONArray r1 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L14
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L14
            return r1
        L14:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L18:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getJSONArrayString(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            r0.<init>(r1)     // Catch: org.json.JSONException -> Le
            org.json.JSONArray r1 = getJSONArray(r0, r2)     // Catch: org.json.JSONException -> Le
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> Le
            return r1
        Le:
            java.lang.String r1 = ""
            return r1
    }

    public static org.json.JSONObject getJSONObject(org.json.JSONObject r1, java.lang.String r2) {
            if (r1 == 0) goto L11
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto L11
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L11:
            r1 = 0
            return r1
    }

    public static java.lang.String getJSONString(org.json.JSONObject r0, java.lang.String r1) {
            org.json.JSONObject r0 = getJSONObject(r0, r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.Object getObject(java.lang.String r1, java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> La
            r0.<init>(r1)     // Catch: org.json.JSONException -> La
            java.lang.Object r1 = getObject(r0, r2)     // Catch: org.json.JSONException -> La
            return r1
        La:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object getObject(org.json.JSONObject r1, java.lang.String r2) {
            boolean r0 = r1.has(r2)     // Catch: org.json.JSONException -> Lb
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r1.get(r2)     // Catch: org.json.JSONException -> Lb
            return r1
        Lb:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        Lf:
            r1 = 0
            return r1
    }

    public static java.lang.String getStringFromArray(org.json.JSONArray r1, int r2) {
            if (r1 == 0) goto L11
            int r0 = r1.length()
            if (r0 <= 0) goto L11
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
        L11:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String getStringFromJson(org.json.JSONObject r1, java.lang.String r2) {
            if (r1 == 0) goto Ld
            boolean r0 = r1.has(r2)
            if (r0 == 0) goto Ld
            java.lang.String r1 = r1.getString(r2)     // Catch: org.json.JSONException -> Ld
            return r1
        Ld:
            java.lang.String r1 = ""
            return r1
    }

    public static boolean isEmptyJSONObject(org.json.JSONObject r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static boolean isValidJson(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r2 = parseJSONObject(r2)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            java.util.Iterator r2 = r2.keys()
            boolean r2 = r2.hasNext()
            return r2
    }

    private static java.lang.Object jsonArray2Array(org.json.JSONArray r4, java.lang.Class<?> r5) {
            if (r4 == 0) goto L37
            int r0 = r4.length()
            if (r0 <= 0) goto L37
            java.lang.Class r5 = r5.getComponentType()     // Catch: org.json.JSONException -> L33
            if (r5 == 0) goto L37
            int r0 = r4.length()     // Catch: org.json.JSONException -> L33
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r5, r0)     // Catch: org.json.JSONException -> L33
            r2 = 0
        L17:
            if (r2 >= r0) goto L32
            boolean r3 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r5)     // Catch: org.json.JSONException -> L33
            if (r3 == 0) goto L24
            java.lang.Object r3 = r4.get(r2)     // Catch: org.json.JSONException -> L33
            goto L2c
        L24:
            org.json.JSONObject r3 = r4.getJSONObject(r2)     // Catch: org.json.JSONException -> L33
            java.lang.Object r3 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.createNewBaseFromJsonModel(r5, r3)     // Catch: org.json.JSONException -> L33
        L2c:
            java.lang.reflect.Array.set(r1, r2, r3)     // Catch: org.json.JSONException -> L33
            int r2 = r2 + 1
            goto L17
        L32:
            return r1
        L33:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L37:
            r4 = 0
            return r4
    }

    private static java.util.List<java.lang.Object> jsonArray2List(org.json.JSONArray r3, java.lang.Class<?> r4, java.lang.reflect.Type r5) {
            r0 = 0
            if (r3 == 0) goto L59
            int r1 = r3.length()     // Catch: org.json.JSONException -> L1e
            if (r1 <= 0) goto L59
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType     // Catch: org.json.JSONException -> L1e
            if (r1 == 0) goto L59
            boolean r1 = r4.isInterface()     // Catch: org.json.JSONException -> L1e
            if (r1 != 0) goto L20
            int r1 = r4.getModifiers()     // Catch: org.json.JSONException -> L1e
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)     // Catch: org.json.JSONException -> L1e
            if (r1 == 0) goto L22
            goto L20
        L1e:
            r3 = move-exception
            goto L56
        L20:
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
        L22:
            java.util.List r0 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.createNewListInstance(r4)     // Catch: org.json.JSONException -> L1e
            if (r0 == 0) goto L55
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5     // Catch: org.json.JSONException -> L1e
            java.lang.reflect.Type[] r4 = r5.getActualTypeArguments()     // Catch: org.json.JSONException -> L1e
            r5 = 0
            r4 = r4[r5]     // Catch: org.json.JSONException -> L1e
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: org.json.JSONException -> L1e
            int r1 = r3.length()     // Catch: org.json.JSONException -> L1e
        L37:
            if (r5 >= r1) goto L55
            boolean r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r4)     // Catch: org.json.JSONException -> L1e
            if (r2 == 0) goto L47
            java.lang.Object r2 = r3.get(r5)     // Catch: org.json.JSONException -> L1e
            r0.add(r2)     // Catch: org.json.JSONException -> L1e
            goto L52
        L47:
            org.json.JSONObject r2 = r3.getJSONObject(r5)     // Catch: org.json.JSONException -> L1e
            java.lang.Object r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.createNewBaseFromJsonModel(r4, r2)     // Catch: org.json.JSONException -> L1e
            r0.add(r2)     // Catch: org.json.JSONException -> L1e
        L52:
            int r5 = r5 + 1
            goto L37
        L55:
            return r0
        L56:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)
        L59:
            return r0
    }

    public static org.json.JSONObject keepValues(org.json.JSONObject r1, java.lang.String[] r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6
            r0.<init>(r1, r2)     // Catch: org.json.JSONException -> L6
            return r0
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    private static org.json.JSONArray list2JSONArray(java.lang.Object r3, java.lang.reflect.Type r4) {
            org.json.JSONArray r0 = emptyJSONArray()
            if (r3 == 0) goto L4d
            java.lang.Class r1 = r3.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L4d
            java.util.List r3 = (java.util.List) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4d
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r1 = 0
            r4 = r4[r1]
            java.lang.Class r4 = (java.lang.Class) r4
        L23:
            int r2 = r3.size()
            if (r1 >= r2) goto L4d
            boolean r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r4)
            if (r2 == 0) goto L37
            java.lang.Object r2 = r3.get(r1)
            r0.put(r2)
            goto L4a
        L37:
            java.lang.Class<xyz.adscope.common.v2.model.IJsonMappingModel> r2 = xyz.adscope.common.v2.model.IJsonMappingModel.class
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r3.get(r1)
            org.json.JSONObject r2 = parseEntry2Json(r2)
            r0.put(r2)
        L4a:
            int r1 = r1 + 1
            goto L23
        L4d:
            return r0
    }

    public static org.json.JSONObject parseEntry2Json(java.lang.Object r7) {
            java.lang.Class<xyz.adscope.common.v2.model.annotation.JsonParseNode> r0 = xyz.adscope.common.v2.model.annotation.JsonParseNode.class
            if (r7 == 0) goto L99
            org.json.JSONObject r1 = emptyJSONObject()     // Catch: org.json.JSONException -> L99
            java.lang.Class r2 = r7.getClass()     // Catch: org.json.JSONException -> L99
            java.util.List r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r2)     // Catch: org.json.JSONException -> L99
            boolean r3 = r2.isEmpty()     // Catch: org.json.JSONException -> L99
            if (r3 != 0) goto L98
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L99
        L1a:
            boolean r3 = r2.hasNext()     // Catch: org.json.JSONException -> L99
            if (r3 == 0) goto L98
            java.lang.Object r3 = r2.next()     // Catch: org.json.JSONException -> L99
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: org.json.JSONException -> L99
            boolean r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isAnnotationType(r3, r0)     // Catch: org.json.JSONException -> L99
            if (r4 == 0) goto L1a
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r0)     // Catch: org.json.JSONException -> L99
            xyz.adscope.common.v2.model.annotation.JsonParseNode r4 = (xyz.adscope.common.v2.model.annotation.JsonParseNode) r4     // Catch: org.json.JSONException -> L99
            if (r4 == 0) goto L1a
            java.lang.String r4 = r4.key()     // Catch: org.json.JSONException -> L99
            java.lang.Class r5 = r3.getType()     // Catch: org.json.JSONException -> L99
            boolean r5 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r5)     // Catch: org.json.JSONException -> L99
            if (r5 == 0) goto L4a
            java.lang.Object r3 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r7, r3)     // Catch: org.json.JSONException -> L99
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L99
            goto L1a
        L4a:
            java.lang.Class<xyz.adscope.common.v2.model.IJsonMappingModel> r5 = xyz.adscope.common.v2.model.IJsonMappingModel.class
            java.lang.Class r6 = r3.getType()     // Catch: org.json.JSONException -> L99
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: org.json.JSONException -> L99
            if (r5 == 0) goto L62
            java.lang.Object r3 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r7, r3)     // Catch: org.json.JSONException -> L99
            org.json.JSONObject r3 = parseEntry2Json(r3)     // Catch: org.json.JSONException -> L99
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L99
            goto L1a
        L62:
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class r6 = r3.getType()     // Catch: org.json.JSONException -> L99
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: org.json.JSONException -> L99
            if (r5 == 0) goto L7e
            java.lang.Object r5 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r7, r3)     // Catch: org.json.JSONException -> L99
            java.lang.reflect.Type r3 = r3.getGenericType()     // Catch: org.json.JSONException -> L99
            org.json.JSONArray r3 = list2JSONArray(r5, r3)     // Catch: org.json.JSONException -> L99
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L99
            goto L1a
        L7e:
            java.lang.Class r5 = r3.getType()     // Catch: org.json.JSONException -> L99
            boolean r5 = r5.isArray()     // Catch: org.json.JSONException -> L99
            if (r5 == 0) goto L1a
            java.lang.Object r5 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r7, r3)     // Catch: org.json.JSONException -> L99
            java.lang.reflect.Type r3 = r3.getGenericType()     // Catch: org.json.JSONException -> L99
            org.json.JSONArray r3 = array2JSONArray(r5, r3)     // Catch: org.json.JSONException -> L99
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L99
            goto L1a
        L98:
            return r1
        L99:
            org.json.JSONObject r7 = emptyJSONObject()
            return r7
    }

    public static org.json.JSONArray parseJSONArray(java.lang.String r1) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L6
            r0.<init>(r1)     // Catch: org.json.JSONException -> L6
            return r0
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    private static org.json.JSONArray parseJSONArrayByIterator(java.util.Iterator<java.lang.Object> r3, boolean r4) {
            if (r3 == 0) goto L27
            org.json.JSONArray r0 = emptyJSONArray()
        L6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Class r2 = r1.getClass()
            boolean r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r2)
            if (r2 == 0) goto L1e
            r0.put(r1)
            goto L6
        L1e:
            org.json.JSONObject r1 = entry2JsonObject(r1, r4)
            r0.put(r1)
            goto L6
        L26:
            return r0
        L27:
            r3 = 0
            return r3
    }

    public static org.json.JSONObject parseJSONObject(java.lang.String r1) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6
            r0.<init>(r1)     // Catch: org.json.JSONException -> L6
            return r0
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static <T> T parseJson2Entry(java.lang.String r7, java.lang.Class<T> r8) {
            boolean r0 = isValidJson(r7)
            r1 = 0
            if (r0 == 0) goto L4f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            r0.<init>(r7)     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.util.List r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r8)     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.reflect.Constructor r8 = r8.getConstructor(r4)     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            r3[r6] = r7     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.Object r7 = r8.newInstance(r3)     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.util.Iterator r8 = r2.iterator()     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
        L28:
            boolean r2 = r8.hasNext()     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r8.next()     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            java.lang.String r3 = r2.getName()     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            setFieldValueByJson(r7, r2, r0, r3, r1)     // Catch: org.json.JSONException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L41 java.lang.IllegalAccessException -> L43 java.lang.NoSuchMethodException -> L45
            goto L28
        L3c:
            r7 = move-exception
            goto L4c
        L3e:
            return r7
        L3f:
            r7 = move-exception
            goto L4c
        L41:
            r7 = move-exception
            goto L4c
        L43:
            r7 = move-exception
            goto L4c
        L45:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r7)
            throw r8
        L4c:
            xyz.adscope.common.v2.log.SDKLog.stack(r7)
        L4f:
            return r1
    }

    public static void parseJson2Entry(xyz.adscope.common.v2.model.IJsonMappingModel r4, org.json.JSONObject r5) {
            if (r5 == 0) goto L3c
            java.lang.Class r0 = r4.getClass()
            java.util.List r0 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L3c
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class<xyz.adscope.common.v2.model.annotation.JsonParseNode> r2 = xyz.adscope.common.v2.model.annotation.JsonParseNode.class
            boolean r3 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isAnnotationType(r1, r2)
            if (r3 == 0) goto L14
            java.lang.annotation.Annotation r2 = r1.getAnnotation(r2)
            xyz.adscope.common.v2.model.annotation.JsonParseNode r2 = (xyz.adscope.common.v2.model.annotation.JsonParseNode) r2
            if (r2 == 0) goto L14
            java.lang.String r3 = r2.key()
            java.lang.String r2 = r2.defValue()
            setFieldValueByJson(r4, r1, r5, r3, r2)
            goto L14
        L3c:
            return
    }

    public static org.json.JSONArray parseList2JSONArray(java.util.List<xyz.adscope.common.v2.model.IJsonMappingModel> r3) {
            if (r3 == 0) goto L37
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L37
            org.json.JSONArray r0 = emptyJSONArray()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()
            xyz.adscope.common.v2.model.IJsonMappingModel r1 = (xyz.adscope.common.v2.model.IJsonMappingModel) r1
            boolean r2 = r1 instanceof xyz.adscope.common.v2.model.IBaseFromJsonModel
            if (r2 == 0) goto L2a
            xyz.adscope.common.v2.model.IBaseFromJsonModel r1 = (xyz.adscope.common.v2.model.IBaseFromJsonModel) r1
            org.json.JSONObject r1 = r1.asJsonObject()
            r0.put(r1)
            goto L10
        L2a:
            java.lang.String r1 = r1.toJsonString()
            org.json.JSONObject r1 = parseJSONObject(r1)
            r0.put(r1)
            goto L10
        L36:
            return r0
        L37:
            r3 = 0
            return r3
    }

    public static org.json.JSONObject parseMap2JSONObject(java.util.Map<java.lang.String, java.lang.String> r4, boolean r5) {
            if (r4 == 0) goto L53
            boolean r0 = r4.isEmpty()     // Catch: org.json.JSONException -> L4f
            if (r0 != 0) goto L53
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4f
            r0.<init>()     // Catch: org.json.JSONException -> L4f
            java.util.Set r4 = r4.entrySet()     // Catch: org.json.JSONException -> L4f
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> L4f
        L15:
            boolean r1 = r4.hasNext()     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r4.next()     // Catch: org.json.JSONException -> L4f
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto L15
            java.lang.Object r2 = r1.getValue()     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L4f
            if (r5 == 0) goto L3f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L4f
            if (r3 != 0) goto L3f
            java.lang.Object r2 = r1.getKey()     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L4f
            java.lang.Object r1 = r1.getValue()     // Catch: org.json.JSONException -> L4f
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L4f
            goto L15
        L3f:
            java.lang.Object r1 = r1.getKey()     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto L48
            goto L4a
        L48:
            java.lang.String r2 = ""
        L4a:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            goto L15
        L4e:
            return r0
        L4f:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L53:
            r4 = 0
            return r4
    }

    public static org.json.JSONArray parseMap2JsonByKeys(java.util.Map<java.lang.String, java.lang.String> r4, java.lang.String r5, java.lang.String r6) {
            if (r4 == 0) goto L3f
            boolean r0 = r4.isEmpty()     // Catch: org.json.JSONException -> L3b
            if (r0 != 0) goto L3f
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L3b
            r0.<init>()     // Catch: org.json.JSONException -> L3b
            java.util.Set r4 = r4.entrySet()     // Catch: org.json.JSONException -> L3b
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> L3b
        L15:
            boolean r1 = r4.hasNext()     // Catch: org.json.JSONException -> L3b
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r4.next()     // Catch: org.json.JSONException -> L3b
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: org.json.JSONException -> L3b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
            r2.<init>()     // Catch: org.json.JSONException -> L3b
            if (r1 == 0) goto L36
            java.lang.Object r3 = r1.getKey()     // Catch: org.json.JSONException -> L3b
            r2.put(r5, r3)     // Catch: org.json.JSONException -> L3b
            java.lang.Object r1 = r1.getValue()     // Catch: org.json.JSONException -> L3b
            r2.put(r6, r1)     // Catch: org.json.JSONException -> L3b
        L36:
            r0.put(r2)     // Catch: org.json.JSONException -> L3b
            goto L15
        L3a:
            return r0
        L3b:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L3f:
            org.json.JSONArray r4 = emptyJSONArray()
            return r4
    }

    public static java.lang.String parseMap2JsonStr(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = 0
            org.json.JSONObject r1 = parseMap2JSONObject(r1, r0)
            if (r1 == 0) goto Lc
            java.lang.String r1 = r1.toString()
            return r1
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.Object parseValue(java.lang.Object r2, java.lang.reflect.Field r3, boolean r4) {
            java.lang.Object r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r2, r3)
            java.lang.Class r0 = r3.getType()
            boolean r0 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r0)
            if (r0 == 0) goto L26
            if (r2 == 0) goto L11
            return r2
        L11:
            java.lang.Class r2 = r3.getType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L20
            java.lang.String r2 = ""
            return r2
        L20:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L26:
            java.lang.Class r0 = r3.getType()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L4a
            if (r2 == 0) goto L45
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L45
            java.util.Iterator r2 = r2.iterator()
            org.json.JSONArray r2 = parseJSONArrayByIterator(r2, r4)
            return r2
        L45:
            org.json.JSONArray r2 = emptyJSONArray()
            return r2
        L4a:
            java.lang.Class r3 = r3.getType()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L6d
            if (r2 == 0) goto L68
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = r2.length
            if (r3 <= 0) goto L68
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
            org.json.JSONArray r2 = parseJSONArrayByIterator(r2, r4)
            return r2
        L68:
            org.json.JSONArray r2 = emptyJSONArray()
            return r2
        L6d:
            boolean r3 = r2 instanceof xyz.adscope.common.v2.model.IBaseToJsonModel
            if (r3 == 0) goto L76
            org.json.JSONObject r2 = entry2JsonObject(r2, r4)
            return r2
        L76:
            r2 = 0
            return r2
    }

    public static void putObject(org.json.JSONObject r0, java.lang.String r1, java.lang.Object r2) {
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4
            return
        L4:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
            return
    }

    public static org.json.JSONObject removeJsonObjectKeys(org.json.JSONObject r3, java.lang.String... r4) {
            if (r4 == 0) goto Le
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Le
            r2 = r4[r1]
            r3.remove(r2)
            int r1 = r1 + 1
            goto L4
        Le:
            return r3
    }

    private static void setFieldValueByJson(java.lang.Object r2, java.lang.reflect.Field r3, org.json.JSONObject r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.Class<xyz.adscope.common.v2.model.IBaseFromJsonModel> r1 = xyz.adscope.common.v2.model.IBaseFromJsonModel.class
            if (r0 != 0) goto L83
            java.lang.Class r0 = r3.getType()
            boolean r0 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isBasicType(r0)
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.opt(r5)
            if (r0 == 0) goto L20
            java.lang.Object r6 = r4.opt(r5)
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r6)
            goto L29
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L29
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r6)
        L29:
            boolean r6 = r4.has(r5)
            if (r6 == 0) goto L98
            java.lang.Class r6 = r3.getType()
            boolean r6 = r1.isAssignableFrom(r6)
            if (r6 == 0) goto L49
            java.lang.Class r6 = r3.getType()
            org.json.JSONObject r4 = getJSONObject(r4, r5)
            java.lang.Object r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.createNewBaseFromJsonModel(r6, r4)
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r4)
            return
        L49:
            java.lang.Class r6 = r3.getType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r6 = r0.isAssignableFrom(r6)
            if (r6 == 0) goto L69
            org.json.JSONArray r4 = getJSONArray(r4, r5)
            java.lang.Class r5 = r3.getType()
            java.lang.reflect.Type r6 = r3.getGenericType()
            java.util.List r4 = jsonArray2List(r4, r5, r6)
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r4)
            return
        L69:
            java.lang.Class r6 = r3.getType()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L98
            org.json.JSONArray r4 = getJSONArray(r4, r5)
            java.lang.Class r5 = r3.getType()
            java.lang.Object r4 = jsonArray2Array(r4, r5)
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r4)
            return
        L83:
            java.lang.Class r5 = r3.getType()
            boolean r5 = r1.isAssignableFrom(r5)
            if (r5 == 0) goto L98
            java.lang.Class r5 = r3.getType()
            java.lang.Object r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.createNewBaseFromJsonModel(r5, r4)
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r2, r3, r4)
        L98:
            return
    }

    public static void updateJSONValue(org.json.JSONObject r1, java.lang.String r2, java.lang.Object r3) {
            boolean r0 = r1.has(r2)     // Catch: org.json.JSONException -> Ld
            if (r0 == 0) goto L9
            r1.remove(r2)     // Catch: org.json.JSONException -> Ld
        L9:
            r1.put(r2, r3)     // Catch: org.json.JSONException -> Ld
            return
        Ld:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            return
    }
}
