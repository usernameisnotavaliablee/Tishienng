package xyz.adscope.common.json.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class JsonResolver {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class TypeToken<T> {
        final java.lang.Class<? super T> a;
        final java.lang.reflect.Type b;

        protected TypeToken() {
                r1 = this;
                r1.<init>()
                java.lang.Class r0 = r1.getClass()
                java.lang.reflect.Type r0 = getSuperclassTypeParameter(r0)
                r1.b = r0
                java.lang.Class r0 = getRawType(r0)
                r1.a = r0
                return
        }

        public static java.lang.reflect.Type getInterfacesTypeParameter(java.lang.Class<?> r5, java.lang.Class<?> r6) {
                java.lang.reflect.Type[] r5 = r5.getGenericInterfaces()
                int r0 = r5.length
                r1 = 0
                r2 = 0
            L7:
                if (r2 >= r0) goto L25
                r3 = r5[r2]
                boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
                if (r4 == 0) goto L22
                java.lang.Class r4 = getRawType(r3)
                boolean r4 = r6.isAssignableFrom(r4)
                if (r4 == 0) goto L22
                java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
                java.lang.reflect.Type[] r5 = r3.getActualTypeArguments()
                r5 = r5[r1]
                return r5
            L22:
                int r2 = r2 + 1
                goto L7
            L25:
                r5 = 0
                return r5
        }

        public static java.lang.Class<?> getRawType(java.lang.reflect.Type r4) {
                boolean r0 = r4 instanceof java.lang.Class
                if (r0 == 0) goto L7
                java.lang.Class r4 = (java.lang.Class) r4
                return r4
            L7:
                boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L1e
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                java.lang.reflect.Type r4 = r4.getRawType()
                boolean r0 = r4 instanceof java.lang.Class
                if (r0 == 0) goto L18
                java.lang.Class r4 = (java.lang.Class) r4
                return r4
            L18:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r4.<init>()
                throw r4
            L1e:
                boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
                r1 = 0
                if (r0 == 0) goto L36
                java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
                java.lang.reflect.Type r4 = r4.getGenericComponentType()
                java.lang.Class r4 = getRawType(r4)
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r1)
                java.lang.Class r4 = r4.getClass()
                return r4
            L36:
                boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto L3d
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                return r4
            L3d:
                boolean r0 = r4 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto L4e
                java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
                java.lang.reflect.Type[] r4 = r4.getUpperBounds()
                r4 = r4[r1]
                java.lang.Class r4 = getRawType(r4)
                return r4
            L4e:
                if (r4 != 0) goto L53
                java.lang.String r0 = "null"
                goto L5b
            L53:
                java.lang.Class r0 = r4.getClass()
                java.lang.String r0 = r0.getName()
            L5b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
                r2.append(r3)
                r2.append(r4)
                java.lang.String r4 = "> is of type "
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r1.<init>(r4)
                throw r1
        }

        public static java.lang.reflect.Type getSuperclassTypeParameter(java.lang.Class<?> r1) {
                java.lang.reflect.Type r1 = r1.getGenericSuperclass()
                boolean r0 = r1 instanceof java.lang.Class
                if (r0 != 0) goto L12
                java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
                java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
                r0 = 0
                r1 = r1[r0]
                return r1
            L12:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r0 = "Missing type parameter."
                r1.<init>(r0)
                throw r1
        }

        public java.lang.Class<?> getRawType() {
                r1 = this;
                java.lang.Class<? super T> r0 = r1.a
                return r0
        }

        public java.lang.reflect.Type getType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.b
                return r0
        }
    }

    public JsonResolver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Object a(org.json.JSONArray r4, java.lang.Class<?> r5) {
            java.lang.Class r5 = r5.getComponentType()
            int r0 = r4.length()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r5, r0)
            r2 = 0
        Ld:
            if (r2 >= r0) goto L28
            boolean r3 = isBasicType(r5)
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r4.get(r2)
            goto L22
        L1a:
            org.json.JSONObject r3 = r4.getJSONObject(r2)
            java.lang.Object r3 = a(r3, r5)
        L22:
            java.lang.reflect.Array.set(r1, r2, r3)
            int r2 = r2 + 1
            goto Ld
        L28:
            return r1
    }

    private static <T> T a(org.json.JSONObject r4, java.lang.Class<T> r5) {
            java.lang.Object r0 = r5.newInstance()
            java.util.List r5 = a(r5)
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 != 0) goto L26
            r2 = 1
            r1.setAccessible(r2)
        L26:
            a(r0, r1, r4)     // Catch: org.json.JSONException -> L2a
            goto Lc
        L2a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r2, r1)
            goto Lc
        L42:
            return r0
    }

    private static java.lang.String a(java.lang.Object r9) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.Class r1 = r9.getClass()
            java.util.List r1 = a(r1)
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lff
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 != 0) goto L2b
            r3 = 1
            r2.setAccessible(r3)
        L2b:
            java.lang.Class<xyz.adscope.common.json.inter.JsonNode> r3 = xyz.adscope.common.json.inter.JsonNode.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            xyz.adscope.common.json.inter.JsonNode r3 = (xyz.adscope.common.json.inter.JsonNode) r3
            if (r3 == 0) goto L11
            java.lang.Object r4 = r2.get(r9)
            if (r4 == 0) goto L11
            java.lang.String r3 = r3.key()
            java.lang.Class r5 = r2.getType()
            boolean r6 = isBasicType(r5)
            if (r6 == 0) goto L7f
            boolean r5 = r0.has(r3)
            if (r5 != 0) goto L53
            r0.put(r3, r4)
            goto L11
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "class["
            r4.append(r5)
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            java.lang.String r2 = "] declares multiple JSON fields named name["
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "].."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "JSON::"
            xyz.adscope.common.tool.LogUtil.d(r3, r2)
            goto L11
        L7f:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 == 0) goto Lbc
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L92:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r4.next()
            java.lang.Class r6 = r5.getClass()
            boolean r6 = isBasicType(r6)
            if (r6 == 0) goto Laa
            r2.put(r5)
            goto L92
        Laa:
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r5 = toJson(r5)
            r6.<init>(r5)
            r2.put(r6)
            goto L92
        Lb7:
            r0.put(r3, r2)
            goto L11
        Lbc:
            boolean r2 = r5.isArray()
            if (r2 == 0) goto Lf1
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = r4.length
            r6 = 0
        Lcb:
            if (r6 >= r5) goto Lec
            r7 = r4[r6]
            java.lang.Class r8 = r7.getClass()
            boolean r8 = isBasicType(r8)
            if (r8 == 0) goto Ldd
            r2.put(r7)
            goto Le9
        Ldd:
            org.json.JSONObject r8 = new org.json.JSONObject
            java.lang.String r7 = toJson(r7)
            r8.<init>(r7)
            r2.put(r8)
        Le9:
            int r6 = r6 + 1
            goto Lcb
        Lec:
            r0.put(r3, r2)
            goto L11
        Lf1:
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.String r4 = toJson(r4)
            r2.<init>(r4)
            r0.put(r3, r2)
            goto L11
        Lff:
            java.lang.String r9 = r0.toString()
            return r9
    }

    private static java.util.List<java.lang.reflect.Field> a(java.lang.Class<?> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.Field[] r1 = r2.getDeclaredFields()
            java.util.Collections.addAll(r0, r1)
            a(r0, r2)
            return r0
    }

    private static java.util.List<java.lang.Object> a(org.json.JSONArray r3, java.lang.Class<?> r4, java.lang.reflect.Type r5) {
            if (r3 == 0) goto L4c
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L4c
            boolean r0 = r4.isInterface()
            if (r0 != 0) goto L16
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L18
        L16:
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
        L18:
            java.lang.Object r4 = r4.newInstance()
            java.util.List r4 = (java.util.List) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r0 = 0
            r5 = r5[r0]
            java.lang.Class r5 = (java.lang.Class) r5
            int r1 = r3.length()
        L2d:
            if (r0 >= r1) goto L4b
            boolean r2 = isBasicType(r5)
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r3.get(r0)
            r4.add(r2)
            goto L48
        L3d:
            org.json.JSONObject r2 = r3.getJSONObject(r0)
            java.lang.Object r2 = a(r2, r5)
            r4.add(r2)
        L48:
            int r0 = r0 + 1
            goto L2d
        L4b:
            return r4
        L4c:
            r3 = 0
            return r3
    }

    private static void a(java.lang.Object r6, java.lang.reflect.Field r7, org.json.JSONObject r8) {
            java.lang.Class<xyz.adscope.common.json.inter.JsonNode> r0 = xyz.adscope.common.json.inter.JsonNode.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            xyz.adscope.common.json.inter.JsonNode r0 = (xyz.adscope.common.json.inter.JsonNode) r0
            if (r0 == 0) goto Ld0
            java.lang.String r0 = r0.key()
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto Ld0
            java.lang.Class r1 = r7.getType()
            boolean r2 = isBasicType(r1)
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r8.get(r0)
            r8.remove(r0)
            boolean r8 = isWrapType(r1)     // Catch: java.lang.Exception -> L52
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r8 != 0) goto L38
            boolean r8 = r3.isAssignableFrom(r1)     // Catch: java.lang.Exception -> L52
            if (r8 == 0) goto L34
            goto L38
        L34:
            r7.set(r6, r2)     // Catch: java.lang.Exception -> L52
            return
        L38:
            r8 = 1
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L52
            r5 = 0
            r4[r5] = r3     // Catch: java.lang.Exception -> L52
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch: java.lang.Exception -> L52
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Exception -> L52
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L52
            r8[r5] = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r8 = r1.newInstance(r8)     // Catch: java.lang.Exception -> L52
            r7.set(r6, r8)     // Catch: java.lang.Exception -> L52
            return
        L52:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "invalid value["
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = "] for field["
            r6.append(r8)
            java.lang.String r7 = r7.getName()
            r6.append(r7)
            java.lang.String r7 = "]; valueClass["
            r6.append(r7)
            java.lang.Class r7 = r2.getClass()
            r6.append(r7)
            java.lang.String r7 = "]; annotationName["
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = "]"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            org.json.JSONException r7 = new org.json.JSONException
            r7.<init>(r6)
            throw r7
        L8e:
            java.lang.Object r2 = r8.get(r0)
            if (r2 == 0) goto Ld0
            r3 = 0
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ld0
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto Lb3
            org.json.JSONArray r8 = r8.getJSONArray(r0)
            java.lang.reflect.Type r0 = r7.getGenericType()
            java.util.List r8 = a(r8, r1, r0)
            r7.set(r6, r8)
            return
        Lb3:
            boolean r2 = r1.isArray()
            if (r2 == 0) goto Lc5
            org.json.JSONArray r8 = r8.getJSONArray(r0)
            java.lang.Object r8 = a(r8, r1)
            r7.set(r6, r8)
            return
        Lc5:
            org.json.JSONObject r8 = r8.getJSONObject(r0)
            java.lang.Object r8 = a(r8, r1)
            r7.set(r6, r8)
        Ld0:
            return
    }

    private static void a(java.util.List<java.lang.reflect.Field> r2, java.lang.Class<?> r3) {
            java.lang.Class r3 = r3.getSuperclass()
            if (r3 == 0) goto L13
            java.lang.reflect.Field[] r0 = r3.getDeclaredFields()
            int r1 = r0.length
            if (r1 <= 0) goto L13
            java.util.Collections.addAll(r2, r0)
            a(r2, r3)
        L13:
            return
    }

    public static <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.Object r1 = a(r0, r2)
            return r1
    }

    public static <T> T fromJson(java.lang.String r3, java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L12
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r3)
            java.lang.Class r3 = xyz.adscope.common.json.util.JsonResolver.TypeToken.getRawType(r4)
            java.lang.Object r3 = a(r0, r3)
            return r3
        L12:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L24
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r3)
            java.lang.Class r3 = xyz.adscope.common.json.util.JsonResolver.TypeToken.getRawType(r4)
            java.util.List r3 = a(r0, r3, r4)
            return r3
        L24:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L36
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r3)
            java.lang.Class r3 = xyz.adscope.common.json.util.JsonResolver.TypeToken.getRawType(r4)
            java.lang.Object r3 = a(r0, r3)
            return r3
        L36:
            if (r4 != 0) goto L3b
            java.lang.String r3 = "null"
            goto L43
        L3b:
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "> is of type "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static boolean isBasicType(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L14
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            boolean r1 = isWrapType(r1)
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static boolean isWrapType(java.lang.Class<?> r2) {
            r0 = 0
            java.lang.String r1 = "TYPE"
            java.lang.reflect.Field r2 = r2.getField(r1)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L16
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Exception -> L16
            boolean r2 = r2.isPrimitive()     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            return r0
    }

    public static java.lang.String toJson(java.lang.Object r1) {
            java.lang.Class r0 = r1.getClass()
            java.lang.String r1 = toJson(r1, r0)
            return r1
    }

    public static java.lang.String toJson(java.lang.Object r4, java.lang.Class<?> r5) {
            boolean r0 = isBasicType(r5)
            if (r0 == 0) goto Lb
            java.lang.String r4 = r4.toString()
            return r4
        Lb:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L3a
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = toJson(r0)
            r1.<init>(r0)
            r5.put(r1)
            goto L1e
        L35:
            java.lang.String r4 = r5.toString()
            return r4
        L3a:
            boolean r5 = r5.isArray()
            if (r5 == 0) goto L61
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            r1 = 0
        L49:
            if (r1 >= r0) goto L5c
            r2 = r4[r1]
            org.json.JSONObject r3 = new org.json.JSONObject
            java.lang.String r2 = toJson(r2)
            r3.<init>(r2)
            r5.put(r3)
            int r1 = r1 + 1
            goto L49
        L5c:
            java.lang.String r4 = r5.toString()
            return r4
        L61:
            java.lang.String r4 = a(r4)
            return r4
    }
}
