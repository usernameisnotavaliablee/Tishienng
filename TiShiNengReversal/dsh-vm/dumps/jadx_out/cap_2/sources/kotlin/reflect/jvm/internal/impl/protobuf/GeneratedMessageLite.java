package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.a implements java.io.Serializable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class ExtendableMessage<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.d<MessageType> {
        private final kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> extensions;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        protected class a {
            private final java.util.Iterator<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e, java.lang.Object>> a;
            private java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e, java.lang.Object> b;
            private final boolean c;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage d;

            private a(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage r2, boolean r3) {
                    r1 = this;
                    r1.d = r2
                    r1.<init>()
                    kotlin.reflect.jvm.internal.impl.protobuf.g r2 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.access$200(r2)
                    java.util.Iterator r2 = r2.p()
                    r1.a = r2
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L1d
                    java.lang.Object r2 = r2.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    r1.b = r2
                L1d:
                    r1.c = r3
                    return
            }

            /* synthetic */ a(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage r1, boolean r2, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public void a(int r4, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r5) throws java.io.IOException {
                    r3 = this;
                L0:
                    java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object> r0 = r3.b
                    if (r0 == 0) goto L5a
                    java.lang.Object r0 = r0.getKey()
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e) r0
                    int r0 = r0.getNumber()
                    if (r0 >= r4) goto L5a
                    java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object> r0 = r3.b
                    java.lang.Object r0 = r0.getKey()
                    kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e) r0
                    boolean r1 = r3.c
                    if (r1 == 0) goto L3a
                    kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = r0.B()
                    kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE
                    if (r1 != r2) goto L3a
                    boolean r1 = r0.H()
                    if (r1 != 0) goto L3a
                    int r0 = r0.getNumber()
                    java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object> r1 = r3.b
                    java.lang.Object r1 = r1.getValue()
                    kotlin.reflect.jvm.internal.impl.protobuf.n r1 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r1
                    r5.j0(r0, r1)
                    goto L43
                L3a:
                    java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object> r1 = r3.b
                    java.lang.Object r1 = r1.getValue()
                    kotlin.reflect.jvm.internal.impl.protobuf.g.z(r0, r1, r5)
                L43:
                    java.util.Iterator<java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object>> r0 = r3.a
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L56
                    java.util.Iterator<java.util.Map$Entry<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e, java.lang.Object>> r0 = r3.a
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    r3.b = r0
                    goto L0
                L56:
                    r0 = 0
                    r3.b = r0
                    goto L0
                L5a:
                    return
            }
        }

        protected ExtendableMessage() {
                r1 = this;
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.g r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.t()
                r1.extensions = r0
                return
        }

        protected ExtendableMessage(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c<MessageType, ?> r1) {
                r0 = this;
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.g r1 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c.m(r1)
                r0.extensions = r1
                return
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.g access$200(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage r0) {
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r0.extensions
                return r0
        }

        private void verifyExtensionContainingType(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, ?> r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r2.b()
                kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.getDefaultInstanceForType()
                if (r2 != r0) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r2.<init>(r0)
                throw r2
        }

        protected boolean extensionsAreInitialized() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.extensions
                boolean r0 = r0.n()
                return r0
        }

        protected int extensionsSerializedSize() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.extensions
                int r0 = r0.k()
                return r0
        }

        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, Type> r3) {
                r2 = this;
                r2.verifyExtensionContainingType(r3)
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r2.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = r3.d
                java.lang.Object r0 = r0.h(r1)
                if (r0 != 0) goto L10
                Type r3 = r3.b
                return r3
            L10:
                java.lang.Object r3 = r3.a(r0)
                return r3
        }

        public final <Type> Type getExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, java.util.List<Type>> r3, int r4) {
                r2 = this;
                r2.verifyExtensionContainingType(r3)
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r2.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = r3.d
                java.lang.Object r4 = r0.i(r1, r4)
                java.lang.Object r3 = r3.e(r4)
                return r3
        }

        public final <Type> int getExtensionCount(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, java.util.List<Type>> r2) {
                r1 = this;
                r1.verifyExtensionContainingType(r2)
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r2 = r2.d
                int r2 = r0.j(r2)
                return r2
        }

        public final <Type> boolean hasExtension(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, Type> r2) {
                r1 = this;
                r1.verifyExtensionContainingType(r2)
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r2 = r2.d
                boolean r2 = r0.m(r2)
                return r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void makeExtensionsImmutable() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.extensions
                r0.q()
                return
        }

        protected kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage$a r0 = new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage$a
                r1 = 0
                r2 = 0
                r0.<init>(r3, r1, r2)
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
                r6 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r6.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.n r1 = r6.getDefaultInstanceForType()
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                boolean r7 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.access$100(r0, r1, r2, r3, r4, r5)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a.a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b> extends kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a<BuilderType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.d a;

        protected b() {
                r1 = this;
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = kotlin.reflect.jvm.internal.impl.protobuf.d.a
                r1.a = r0
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b r0 = r1.g()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b r0 = r1.g()
                return r0
        }

        public BuilderType g() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "This is supposed to be overridden by subclasses."
                r0.<init>(r1)
                throw r0
        }

        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.n getDefaultInstanceForType() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite r0 = r1.h()
                return r0
        }

        public abstract MessageType h();

        public final kotlin.reflect.jvm.internal.impl.protobuf.d i() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r1.a
                return r0
        }

        public abstract BuilderType k(MessageType r1);

        public final BuilderType l(kotlin.reflect.jvm.internal.impl.protobuf.d r1) {
                r0 = this;
                r0.a = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class c<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType>, BuilderType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c<MessageType, BuilderType>> extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b<MessageType, BuilderType> implements kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.d<MessageType> {
        private kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> b;
        private boolean c;

        protected c() {
                r1 = this;
                r1.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.g r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.g()
                r1.b = r0
                return
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.g m(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c r0) {
                kotlin.reflect.jvm.internal.impl.protobuf.g r0 = r0.o()
                return r0
        }

        private kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> o() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.b
                r0.q()
                r0 = 0
                r1.c = r0
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.b
                return r0
        }

        private void q() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 != 0) goto Lf
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.b
                kotlin.reflect.jvm.internal.impl.protobuf.g r0 = r0.b()
                r1.b = r0
                r0 = 1
                r1.c = r0
            Lf:
                return
        }

        private void v(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, ?> r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r2.b()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite r0 = r1.h()
                if (r2 != r0) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r2.<init>(r0)
                throw r2
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r0 = r1.p()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0058a
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r0 = r1.p()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b g() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c r0 = r1.p()
                return r0
        }

        public final <Type> BuilderType n(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, java.util.List<Type>> r3, Type r4) {
                r2 = this;
                r2.v(r3)
                r2.q()
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r2.b
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = r3.d
                java.lang.Object r3 = r3.f(r4)
                r0.a(r1, r3)
                return r2
        }

        public BuilderType p() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "This is supposed to be overridden by subclasses."
                r0.<init>(r1)
                throw r0
        }

        protected boolean s() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.b
                boolean r0 = r0.n()
                return r0
        }

        protected final void t(MessageType r2) {
                r1 = this;
                r1.q()
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r1.b
                kotlin.reflect.jvm.internal.impl.protobuf.g r2 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.access$200(r2)
                r0.r(r2)
                return
        }

        public final <Type> BuilderType u(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<MessageType, Type> r3, Type r4) {
                r2 = this;
                r2.v(r3)
                r2.q()
                kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e> r0 = r2.b
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = r3.d
                java.lang.Object r3 = r3.g(r4)
                r0.v(r1, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d<MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage> extends kotlin.reflect.jvm.internal.impl.protobuf.o {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e implements kotlin.reflect.jvm.internal.impl.protobuf.g.b<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> {
        final kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> a;
        final int b;
        final kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType c;
        final boolean d;
        final boolean e;

        e(kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> r1, int r2, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r3, boolean r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType A() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r1.c
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType B() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r1.c
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public kotlin.reflect.jvm.internal.impl.protobuf.n.a G(kotlin.reflect.jvm.internal.impl.protobuf.n.a r1, kotlin.reflect.jvm.internal.impl.protobuf.n r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b r1 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b) r1
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite r2 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite) r2
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b r1 = r1.k(r2)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean H() {
                r1 = this;
                boolean r0 = r1.d
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean P() {
                r1 = this;
                boolean r0 = r1.e
                return r0
        }

        public int a(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e r2) {
                r1 = this;
                int r0 = r1.b
                int r2 = r2.b
                int r0 = r0 - r2
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.h$b<?> r0 = r1.a
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e) r1
                int r1 = r0.a(r1)
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
                r1 = this;
                int r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f<ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.n, Type> {
        final ContainingType a;
        final Type b;
        final kotlin.reflect.jvm.internal.impl.protobuf.n c;
        final kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e d;
        final java.lang.Class e;
        final java.lang.reflect.Method f;

        f(ContainingType r3, Type r4, kotlin.reflect.jvm.internal.impl.protobuf.n r5, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e r6, java.lang.Class r7) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L3f
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = r6.A()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE
                if (r0 != r1) goto L18
                if (r5 == 0) goto L10
                goto L18
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Null messageDefaultInstance"
                r3.<init>(r4)
                throw r3
            L18:
                r2.a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                java.lang.Class<kotlin.reflect.jvm.internal.impl.protobuf.h$a> r3 = kotlin.reflect.jvm.internal.impl.protobuf.h.a.class
                boolean r3 = r3.isAssignableFrom(r7)
                if (r3 == 0) goto L3b
                r3 = 1
                java.lang.Class[] r3 = new java.lang.Class[r3]
                java.lang.Class r4 = java.lang.Integer.TYPE
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = "valueOf"
                java.lang.reflect.Method r3 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.getMethodOrDie(r7, r4, r3)
                r2.f = r3
                return
            L3b:
                r3 = 0
                r2.f = r3
                return
            L3f:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Null containingTypeDefaultInstance"
                r3.<init>(r4)
                throw r3
        }

        java.lang.Object a(java.lang.Object r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r2.d
                boolean r0 = r0.H()
                if (r0 == 0) goto L31
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r2.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r0.B()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L30
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r3 = r3.iterator()
            L1d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r3.next()
                java.lang.Object r1 = r2.e(r1)
                r0.add(r1)
                goto L1d
            L2f:
                return r0
            L30:
                return r3
            L31:
                java.lang.Object r3 = r2.e(r3)
                return r3
        }

        public ContainingType b() {
                r1 = this;
                ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.a
                return r0
        }

        public kotlin.reflect.jvm.internal.impl.protobuf.n c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.c
                return r0
        }

        public int d() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r1.d
                int r0 = r0.getNumber()
                return r0
        }

        java.lang.Object e(java.lang.Object r4) {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r3.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r0.B()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L19
                java.lang.reflect.Method r0 = r3.f
                java.lang.Integer r4 = (java.lang.Integer) r4
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 0
                java.lang.Object r4 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.invokeOrDie(r0, r4, r1)
            L19:
                return r4
        }

        java.lang.Object f(java.lang.Object r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r2.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r0.B()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L14
                kotlin.reflect.jvm.internal.impl.protobuf.h$a r3 = (kotlin.reflect.jvm.internal.impl.protobuf.h.a) r3
                int r3 = r3.getNumber()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            L14:
                return r3
        }

        java.lang.Object g(java.lang.Object r3) {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r2.d
                boolean r0 = r0.H()
                if (r0 == 0) goto L31
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = r2.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r0 = r0.B()
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L30
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r3 = r3.iterator()
            L1d:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r3.next()
                java.lang.Object r1 = r2.f(r1)
                r0.add(r1)
                goto L1d
            L2f:
                return r0
            L30:
                return r3
            L31:
                java.lang.Object r3 = r2.f(r3)
                return r3
        }
    }

    protected GeneratedMessageLite() {
            r0 = this;
            r0.<init>()
            return
    }

    protected GeneratedMessageLite(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$100(kotlin.reflect.jvm.internal.impl.protobuf.g r0, kotlin.reflect.jvm.internal.impl.protobuf.n r1, kotlin.reflect.jvm.internal.impl.protobuf.e r2, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4, int r5) throws java.io.IOException {
            boolean r0 = parseUnknownField(r0, r1, r2, r3, r4, r5)
            return r0
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class r4, java.lang.String r5, java.lang.Class... r6) {
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L5
            return r4
        L5:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 + 45
            int r3 = r5.length()
            int r2 = r2 + r3
            r1.<init>(r2)
            java.lang.String r2 = "Generated message class \""
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "\" missing method \""
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "\"."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r6)
            throw r0
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.n, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType r6, kotlin.reflect.jvm.internal.impl.protobuf.n r7, kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> r8, int r9, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r10, boolean r11, java.lang.Class r12) {
            r1 = r8
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            r2 = r9
            r9 = r7
            r7 = r6
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e
            r4 = 1
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = r12
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    public static <ContainingType extends kotlin.reflect.jvm.internal.impl.protobuf.n, Type> kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.f<ContainingType, Type> newSingularGeneratedExtension(ContainingType r6, Type r7, kotlin.reflect.jvm.internal.impl.protobuf.n r8, kotlin.reflect.jvm.internal.impl.protobuf.h.b<?> r9, int r10, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r11, java.lang.Class r12) {
            r1 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e
            r4 = 0
            r5 = 0
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = r12
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    private static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.n> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.b(r10)
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.a(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$f r6 = r9.b(r6, r1)
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L13
        L10:
            r0 = 1
        L11:
            r3 = 0
            goto L3d
        L13:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r3 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.A()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.g.l(r3, r2)
            if (r0 != r3) goto L21
            r0 = 0
            goto L11
        L21:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r3 = r6.d
            boolean r4 = r3.d
            if (r4 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.c
            boolean r3 = r3.isPackable()
            if (r3 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r3 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.A()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.g.l(r3, r1)
            if (r0 != r3) goto L10
            r0 = 0
            r3 = 1
        L3d:
            if (r0 == 0) goto L44
            boolean r5 = r7.P(r10, r8)
            return r5
        L44:
            if (r3 == 0) goto L94
            int r8 = r7.A()
            int r8 = r7.j(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r9 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.A()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM
            if (r9 != r10) goto L79
        L58:
            int r9 = r7.e()
            if (r9 <= 0) goto L8f
            int r9 = r7.n()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r10 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.h$b r10 = r10.b()
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r9 = r10.a(r9)
            if (r9 != 0) goto L6f
            return r1
        L6f:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r10 = r6.d
            java.lang.Object r9 = r6.f(r9)
            r5.a(r10, r9)
            goto L58
        L79:
            int r9 = r7.e()
            if (r9 <= 0) goto L8f
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r9 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.A()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.g.u(r7, r9, r2)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r10 = r6.d
            r5.a(r10, r9)
            goto L79
        L8f:
            r7.i(r8)
            goto L121
        L94:
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a.a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r3 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r3 = r3.B()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r1) goto Lcb
            r9 = 2
            if (r0 == r9) goto Lb2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = r8.A()
            java.lang.Object r7 = kotlin.reflect.jvm.internal.impl.protobuf.g.u(r7, r8, r2)
            goto L106
        Lb2:
            int r7 = r7.n()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r9 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.h$b r9 = r9.b()
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r9 = r9.a(r7)
            if (r9 != 0) goto Lc9
            r8.s0(r10)
            r8.C0(r7)
            return r1
        Lc9:
            r7 = r9
            goto L106
        Lcb:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            boolean r8 = r8.H()
            if (r8 != 0) goto Le2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            java.lang.Object r8 = r5.h(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.n r8 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r8
            if (r8 == 0) goto Le2
            kotlin.reflect.jvm.internal.impl.protobuf.n$a r8 = r8.toBuilder()
            goto Le3
        Le2:
            r8 = 0
        Le3:
            if (r8 != 0) goto Led
            kotlin.reflect.jvm.internal.impl.protobuf.n r8 = r6.c()
            kotlin.reflect.jvm.internal.impl.protobuf.n$a r8 = r8.newBuilderForType()
        Led:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r10 = r6.d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.A()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP
            if (r10 != r0) goto Lff
            int r10 = r6.d()
            r7.r(r10, r8, r9)
            goto L102
        Lff:
            r7.v(r8, r9)
        L102:
            kotlin.reflect.jvm.internal.impl.protobuf.n r7 = r8.build()
        L106:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            boolean r8 = r8.H()
            if (r8 == 0) goto L118
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            java.lang.Object r6 = r6.f(r7)
            r5.a(r8, r6)
            goto L121
        L118:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r8 = r6.d
            java.lang.Object r6 = r6.f(r7)
            r5.v(r8, r6)
        L121:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public kotlin.reflect.jvm.internal.impl.protobuf.p<? extends kotlin.reflect.jvm.internal.impl.protobuf.n> getParserForType() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is supposed to be overridden by subclasses."
            r0.<init>(r1)
            throw r0
    }

    protected void makeExtensionsImmutable() {
            r0 = this;
            return
    }

    protected boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.e r1, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2, kotlin.reflect.jvm.internal.impl.protobuf.f r3, int r4) throws java.io.IOException {
            r0 = this;
            boolean r1 = r1.P(r4, r2)
            return r1
    }
}
