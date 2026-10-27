package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class ResourceLeakDetectorFactory {
    private static volatile io.netty.util.ResourceLeakDetectorFactory factoryInstance;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DefaultResourceLeakDetectorFactory extends io.netty.util.ResourceLeakDetectorFactory {
        private final java.lang.reflect.Constructor<?> customClassConstructor;
        private final java.lang.reflect.Constructor<?> obsoleteCustomClassConstructor;


        DefaultResourceLeakDetectorFactory() {
                r4 = this;
                r4.<init>()
                r0 = 0
                io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1 r1 = new io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory$1     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L10
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.lang.Throwable -> L10
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L10
                goto L1b
            L10:
                r1 = move-exception
                io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.String r3 = "Could not access System property: io.netty.customResourceLeakDetector"
                r2.error(r3, r1)
                r1 = r0
            L1b:
                if (r1 != 0) goto L22
                r4.customClassConstructor = r0
                r4.obsoleteCustomClassConstructor = r0
                goto L2e
            L22:
                java.lang.reflect.Constructor r0 = obsoleteCustomClassConstructor(r1)
                r4.obsoleteCustomClassConstructor = r0
                java.lang.reflect.Constructor r0 = customClassConstructor(r1)
                r4.customClassConstructor = r0
            L2e:
                return
        }

        private static java.lang.reflect.Constructor<?> customClassConstructor(java.lang.String r5) {
                java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getSystemClassLoader()     // Catch: java.lang.Throwable -> L22
                r1 = 1
                java.lang.Class r0 = java.lang.Class.forName(r5, r1, r0)     // Catch: java.lang.Throwable -> L22
                java.lang.Class<io.netty.util.ResourceLeakDetector> r2 = io.netty.util.ResourceLeakDetector.class
                boolean r2 = r2.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L22
                if (r2 == 0) goto L24
                r2 = 2
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L22
                java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Throwable -> L22
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L22
                r2[r1] = r3     // Catch: java.lang.Throwable -> L22
                java.lang.reflect.Constructor r5 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> L22
                return r5
            L22:
                r0 = move-exception
                goto L2e
            L24:
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetectorFactory.access$000()     // Catch: java.lang.Throwable -> L22
                java.lang.String r1 = "Class {} does not inherit from ResourceLeakDetector."
                r0.error(r1, r5)     // Catch: java.lang.Throwable -> L22
                goto L37
            L2e:
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.String r2 = "Could not load custom resource leak detector class provided: {}"
                r1.error(r2, r5, r0)
            L37:
                r5 = 0
                return r5
        }

        private static java.lang.reflect.Constructor<?> obsoleteCustomClassConstructor(java.lang.String r5) {
                java.lang.ClassLoader r0 = io.netty.util.internal.PlatformDependent.getSystemClassLoader()     // Catch: java.lang.Throwable -> L27
                r1 = 1
                java.lang.Class r0 = java.lang.Class.forName(r5, r1, r0)     // Catch: java.lang.Throwable -> L27
                java.lang.Class<io.netty.util.ResourceLeakDetector> r2 = io.netty.util.ResourceLeakDetector.class
                boolean r2 = r2.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L29
                r2 = 3
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L27
                java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Throwable -> L27
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L27
                r2[r1] = r3     // Catch: java.lang.Throwable -> L27
                java.lang.Class r1 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L27
                r3 = 2
                r2[r3] = r1     // Catch: java.lang.Throwable -> L27
                java.lang.reflect.Constructor r5 = r0.getConstructor(r2)     // Catch: java.lang.Throwable -> L27
                return r5
            L27:
                r0 = move-exception
                goto L33
            L29:
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetectorFactory.access$000()     // Catch: java.lang.Throwable -> L27
                java.lang.String r1 = "Class {} does not inherit from ResourceLeakDetector."
                r0.error(r1, r5)     // Catch: java.lang.Throwable -> L27
                goto L3c
            L33:
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.String r2 = "Could not load custom resource leak detector class provided: {}"
                r1.error(r2, r5, r0)
            L3c:
                r5 = 0
                return r5
        }

        @Override // io.netty.util.ResourceLeakDetectorFactory
        public <T> io.netty.util.ResourceLeakDetector<T> newResourceLeakDetector(java.lang.Class<T> r8, int r9) {
                r7 = this;
                java.lang.reflect.Constructor<?> r0 = r7.customClassConstructor
                if (r0 == 0) goto L48
                r1 = 1
                r2 = 0
                r3 = 2
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2b
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2b
                r5[r2] = r8     // Catch: java.lang.Throwable -> L2b
                r5[r1] = r4     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.Throwable -> L2b
                io.netty.util.ResourceLeakDetector r0 = (io.netty.util.ResourceLeakDetector) r0     // Catch: java.lang.Throwable -> L2b
                io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.ResourceLeakDetectorFactory.access$000()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r5 = "Loaded custom ResourceLeakDetector: {}"
                java.lang.reflect.Constructor<?> r6 = r7.customClassConstructor     // Catch: java.lang.Throwable -> L2b
                java.lang.Class r6 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L2b
                r4.debug(r5, r6)     // Catch: java.lang.Throwable -> L2b
                return r0
            L2b:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.reflect.Constructor<?> r5 = r7.customClassConstructor
                java.lang.Class r5 = r5.getDeclaringClass()
                java.lang.String r5 = r5.getName()
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r2] = r5
                r6[r1] = r8
                r6[r3] = r0
                java.lang.String r0 = "Could not load custom resource leak detector provided: {} with the given resource: {}"
                r4.error(r0, r6)
            L48:
                io.netty.util.ResourceLeakDetector r0 = new io.netty.util.ResourceLeakDetector
                r0.<init>(r8, r9)
                io.netty.util.internal.logging.InternalLogger r8 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.String r9 = "Loaded default ResourceLeakDetector: {}"
                r8.debug(r9, r0)
                return r0
        }

        @Override // io.netty.util.ResourceLeakDetectorFactory
        public <T> io.netty.util.ResourceLeakDetector<T> newResourceLeakDetector(java.lang.Class<T> r9, int r10, long r11) {
                r8 = this;
                java.lang.reflect.Constructor<?> r0 = r8.obsoleteCustomClassConstructor
                if (r0 == 0) goto L4e
                r1 = 2
                r2 = 1
                r3 = 0
                r4 = 3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L32
                java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L32
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L32
                r7[r3] = r9     // Catch: java.lang.Throwable -> L32
                r7[r2] = r5     // Catch: java.lang.Throwable -> L32
                r7[r1] = r6     // Catch: java.lang.Throwable -> L32
                java.lang.Object r0 = r0.newInstance(r7)     // Catch: java.lang.Throwable -> L32
                io.netty.util.ResourceLeakDetector r0 = (io.netty.util.ResourceLeakDetector) r0     // Catch: java.lang.Throwable -> L32
                io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.ResourceLeakDetectorFactory.access$000()     // Catch: java.lang.Throwable -> L32
                java.lang.String r6 = "Loaded custom ResourceLeakDetector: {}"
                java.lang.reflect.Constructor<?> r7 = r8.obsoleteCustomClassConstructor     // Catch: java.lang.Throwable -> L32
                java.lang.Class r7 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L32
                java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L32
                r5.debug(r6, r7)     // Catch: java.lang.Throwable -> L32
                return r0
            L32:
                r0 = move-exception
                io.netty.util.internal.logging.InternalLogger r5 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.reflect.Constructor<?> r6 = r8.obsoleteCustomClassConstructor
                java.lang.Class r6 = r6.getDeclaringClass()
                java.lang.String r6 = r6.getName()
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r3] = r6
                r4[r2] = r9
                r4[r1] = r0
                java.lang.String r0 = "Could not load custom resource leak detector provided: {} with the given resource: {}"
                r5.error(r0, r4)
            L4e:
                io.netty.util.ResourceLeakDetector r0 = new io.netty.util.ResourceLeakDetector
                r0.<init>(r9, r10, r11)
                io.netty.util.internal.logging.InternalLogger r9 = io.netty.util.ResourceLeakDetectorFactory.access$000()
                java.lang.String r10 = "Loaded default ResourceLeakDetector: {}"
                r9.debug(r10, r0)
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.util.ResourceLeakDetectorFactory> r0 = io.netty.util.ResourceLeakDetectorFactory.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.ResourceLeakDetectorFactory.logger = r0
            io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory r0 = new io.netty.util.ResourceLeakDetectorFactory$DefaultResourceLeakDetectorFactory
            r0.<init>()
            io.netty.util.ResourceLeakDetectorFactory.factoryInstance = r0
            return
    }

    public ResourceLeakDetectorFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ResourceLeakDetectorFactory.logger
            return r0
    }

    public static io.netty.util.ResourceLeakDetectorFactory instance() {
            io.netty.util.ResourceLeakDetectorFactory r0 = io.netty.util.ResourceLeakDetectorFactory.factoryInstance
            return r0
    }

    public static void setResourceLeakDetectorFactory(io.netty.util.ResourceLeakDetectorFactory r1) {
            java.lang.String r0 = "factory"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            io.netty.util.ResourceLeakDetectorFactory r1 = (io.netty.util.ResourceLeakDetectorFactory) r1
            io.netty.util.ResourceLeakDetectorFactory.factoryInstance = r1
            return
    }

    public final <T> io.netty.util.ResourceLeakDetector<T> newResourceLeakDetector(java.lang.Class<T> r2) {
            r1 = this;
            int r0 = io.netty.util.ResourceLeakDetector.SAMPLING_INTERVAL
            io.netty.util.ResourceLeakDetector r2 = r1.newResourceLeakDetector(r2, r0)
            return r2
    }

    public <T> io.netty.util.ResourceLeakDetector<T> newResourceLeakDetector(java.lang.Class<T> r3, int r4) {
            r2 = this;
            int r4 = io.netty.util.ResourceLeakDetector.SAMPLING_INTERVAL
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            io.netty.util.ResourceLeakDetector r3 = r2.newResourceLeakDetector(r3, r4, r0)
            return r3
    }

    @java.lang.Deprecated
    public abstract <T> io.netty.util.ResourceLeakDetector<T> newResourceLeakDetector(java.lang.Class<T> r1, int r2, long r3);
}
