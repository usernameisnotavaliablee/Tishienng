package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface z<E> extends kotlinx.coroutines.r0, kotlinx.coroutines.channels.c0<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super E> r0, E r1) {
                boolean r0 = kotlinx.coroutines.channels.c0.a.c(r0, r1)
                return r0
        }
    }

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.channels.c0<E> getChannel();
}
