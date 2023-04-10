package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.google.mlkit.samples.vision.digitalink.DataBinderMapperImpl());
  }
}
