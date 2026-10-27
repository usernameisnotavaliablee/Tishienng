package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MergedDataBinderMapper extends androidx.databinding.DataBinderMapper {
    private static final java.lang.String TAG = "MergedDataBinderMapper";
    private java.util.Set<java.lang.Class<? extends androidx.databinding.DataBinderMapper>> mExistingMappers;
    private java.util.List<java.lang.String> mFeatureBindingMappers;
    private java.util.List<androidx.databinding.DataBinderMapper> mMappers;

    public MergedDataBinderMapper() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mExistingMappers = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mMappers = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mFeatureBindingMappers = r0
            return
    }

    private boolean loadFeatures() {
            r5 = this;
            java.util.List<java.lang.String> r0 = r5.mFeatureBindingMappers
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<androidx.databinding.DataBinderMapper> r4 = androidx.databinding.DataBinderMapper.class
            boolean r4 = r4.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L7
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Throwable -> L2f
            androidx.databinding.DataBinderMapper r3 = (androidx.databinding.DataBinderMapper) r3     // Catch: java.lang.Throwable -> L2f
            r5.addMapper(r3)     // Catch: java.lang.Throwable -> L2f
            java.util.List<java.lang.String> r3 = r5.mFeatureBindingMappers     // Catch: java.lang.Throwable -> L2f
            r3.remove(r2)     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            goto L7
        L2f:
            goto L7
        L31:
            return r1
    }

    public void addMapper(androidx.databinding.DataBinderMapper r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.util.Set<java.lang.Class<? extends androidx.databinding.DataBinderMapper>> r1 = r2.mExistingMappers
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L29
            java.util.List<androidx.databinding.DataBinderMapper> r0 = r2.mMappers
            r0.add(r3)
            java.util.List r3 = r3.collectDependencies()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            androidx.databinding.DataBinderMapper r0 = (androidx.databinding.DataBinderMapper) r0
            r2.addMapper(r0)
            goto L19
        L29:
            return
    }

    protected void addMapper(java.lang.String r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.mFeatureBindingMappers
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".DataBinderMapperImpl"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.add(r3)
            return
    }

    @Override // androidx.databinding.DataBinderMapper
    public java.lang.String convertBrIdToString(int r3) {
            r2 = this;
            java.util.List<androidx.databinding.DataBinderMapper> r0 = r2.mMappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1
            java.lang.String r1 = r1.convertBrIdToString(r3)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.loadFeatures()
            if (r0 == 0) goto L24
            java.lang.String r3 = r2.convertBrIdToString(r3)
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r3, android.view.View r4, int r5) {
            r2 = this;
            java.util.List<androidx.databinding.DataBinderMapper> r0 = r2.mMappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1
            androidx.databinding.ViewDataBinding r1 = r1.getDataBinder(r3, r4, r5)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.loadFeatures()
            if (r0 == 0) goto L24
            androidx.databinding.ViewDataBinding r3 = r2.getDataBinder(r3, r4, r5)
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.databinding.DataBinderMapper
    public androidx.databinding.ViewDataBinding getDataBinder(androidx.databinding.DataBindingComponent r3, android.view.View[] r4, int r5) {
            r2 = this;
            java.util.List<androidx.databinding.DataBinderMapper> r0 = r2.mMappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1
            androidx.databinding.ViewDataBinding r1 = r1.getDataBinder(r3, r4, r5)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.loadFeatures()
            if (r0 == 0) goto L24
            androidx.databinding.ViewDataBinding r3 = r2.getDataBinder(r3, r4, r5)
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(java.lang.String r3) {
            r2 = this;
            java.util.List<androidx.databinding.DataBinderMapper> r0 = r2.mMappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1
            int r1 = r1.getLayoutId(r3)
            if (r1 == 0) goto L6
            return r1
        L19:
            boolean r0 = r2.loadFeatures()
            if (r0 == 0) goto L24
            int r3 = r2.getLayoutId(r3)
            return r3
        L24:
            r3 = 0
            return r3
    }
}
