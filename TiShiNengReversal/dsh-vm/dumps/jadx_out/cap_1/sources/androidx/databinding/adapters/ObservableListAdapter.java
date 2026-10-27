package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ObservableListAdapter<T> extends android.widget.BaseAdapter {
    private final android.content.Context mContext;
    private final int mDropDownResourceId;
    private final android.view.LayoutInflater mLayoutInflater;
    private java.util.List<T> mList;
    private androidx.databinding.ObservableList.OnListChangedCallback mListChangedCallback;
    private final int mResourceId;
    private final int mTextViewResourceId;


    public ObservableListAdapter(android.content.Context r1, java.util.List<T> r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mResourceId = r3
            r0.mDropDownResourceId = r4
            r0.mTextViewResourceId = r5
            if (r3 != 0) goto Lf
            r1 = 0
            goto L17
        Lf:
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
        L17:
            r0.mLayoutInflater = r1
            r0.setList(r2)
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            java.util.List<T> r0 = r1.mList
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            int r0 = r1.mDropDownResourceId
            android.view.View r2 = r1.getViewForResource(r0, r2, r3, r4)
            return r2
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            java.util.List<T> r0 = r1.mList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            int r0 = r1.mResourceId
            android.view.View r2 = r1.getViewForResource(r0, r2, r3, r4)
            return r2
    }

    public android.view.View getViewForResource(int r2, int r3, android.view.View r4, android.view.ViewGroup r5) {
            r1 = this;
            if (r4 != 0) goto L13
            if (r2 != 0) goto Lc
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r2 = r1.mContext
            r4.<init>(r2)
            goto L13
        Lc:
            android.view.LayoutInflater r4 = r1.mLayoutInflater
            r0 = 0
            android.view.View r4 = r4.inflate(r2, r5, r0)
        L13:
            int r2 = r1.mTextViewResourceId
            if (r2 != 0) goto L19
            r2 = r4
            goto L1d
        L19:
            android.view.View r2 = r4.findViewById(r2)
        L1d:
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.util.List<T> r5 = r1.mList
            java.lang.Object r3 = r5.get(r3)
            boolean r5 = r3 instanceof java.lang.CharSequence
            if (r5 == 0) goto L2c
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L30
        L2c:
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L30:
            r2.setText(r3)
            return r4
    }

    public void setList(java.util.List<T> r3) {
            r2 = this;
            java.util.List<T> r0 = r2.mList
            if (r0 != r3) goto L5
            return
        L5:
            boolean r1 = r0 instanceof androidx.databinding.ObservableList
            if (r1 == 0) goto L10
            androidx.databinding.ObservableList r0 = (androidx.databinding.ObservableList) r0
            androidx.databinding.ObservableList$OnListChangedCallback r1 = r2.mListChangedCallback
            r0.removeOnListChangedCallback(r1)
        L10:
            r2.mList = r3
            boolean r3 = r3 instanceof androidx.databinding.ObservableList
            if (r3 == 0) goto L2a
            androidx.databinding.ObservableList$OnListChangedCallback r3 = r2.mListChangedCallback
            if (r3 != 0) goto L21
            androidx.databinding.adapters.ObservableListAdapter$1 r3 = new androidx.databinding.adapters.ObservableListAdapter$1
            r3.<init>(r2)
            r2.mListChangedCallback = r3
        L21:
            java.util.List<T> r3 = r2.mList
            androidx.databinding.ObservableList r3 = (androidx.databinding.ObservableList) r3
            androidx.databinding.ObservableList$OnListChangedCallback r0 = r2.mListChangedCallback
            r3.addOnListChangedCallback(r0)
        L2a:
            r2.notifyDataSetChanged()
            return
    }
}
