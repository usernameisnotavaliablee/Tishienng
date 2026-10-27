package xyz.adscope.common.v2.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseMacrosMappingModel implements xyz.adscope.common.v2.model.IMacrosMapping {
    public IBaseMacrosMappingModel() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.v2.model.IMacrosMapping
    public java.util.Map<java.lang.String, java.lang.String> getMacrosReplaceMap() {
            r5 = this;
            java.lang.Class r0 = r5.getClass()
            java.util.List r0 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 1
            r2.setAccessible(r3)
            java.lang.Class<xyz.adscope.common.v2.model.annotation.MacrosReplace> r3 = xyz.adscope.common.v2.model.annotation.MacrosReplace.class
            boolean r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isAnnotationType(r2, r3)
            if (r4 == 0) goto L52
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)     // Catch: java.lang.IllegalAccessException -> L46
            xyz.adscope.common.v2.model.annotation.MacrosReplace r3 = (xyz.adscope.common.v2.model.annotation.MacrosReplace) r3     // Catch: java.lang.IllegalAccessException -> L46
            if (r3 == 0) goto L17
            java.lang.String r3 = r3.macros()     // Catch: java.lang.IllegalAccessException -> L46
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalAccessException -> L46
            if (r2 == 0) goto L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> L46
            goto L4a
        L46:
            r2 = move-exception
            goto L4e
        L48:
            java.lang.String r2 = ""
        L4a:
            r1.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L46
            goto L17
        L4e:
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            goto L17
        L52:
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalAccessException -> L64
            boolean r3 = r2 instanceof xyz.adscope.common.v2.model.IMacrosMapping     // Catch: java.lang.IllegalAccessException -> L64
            if (r3 == 0) goto L17
            xyz.adscope.common.v2.model.IMacrosMapping r2 = (xyz.adscope.common.v2.model.IMacrosMapping) r2     // Catch: java.lang.IllegalAccessException -> L64
            java.util.Map r2 = r2.getMacrosReplaceMap()     // Catch: java.lang.IllegalAccessException -> L64
            r1.putAll(r2)     // Catch: java.lang.IllegalAccessException -> L64
            goto L17
        L64:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            goto L17
        L69:
            return r1
        L6a:
            r0 = 0
            return r0
    }
}
