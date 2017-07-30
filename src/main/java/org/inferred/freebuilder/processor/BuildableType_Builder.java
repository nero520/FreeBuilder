// Autogenerated code. Do not modify.
package org.inferred.freebuilder.processor;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Generated;
import javax.lang.model.type.TypeMirror;
import org.inferred.freebuilder.processor.util.Excerpt;
import org.inferred.freebuilder.processor.util.ParameterizedType;

/**
 * Auto-generated superclass of {@link BuildableType.Builder}, derived from the API of {@link
 * BuildableType}.
 */
@Generated("org.inferred.freebuilder.processor.CodeGenerator")
abstract class BuildableType_Builder {

  /** Creates a new builder using {@code value} as a template. */
  public static BuildableType.Builder from(BuildableType value) {
    return new BuildableType.Builder().mergeFrom(value);
  }

  private static final Joiner COMMA_JOINER = Joiner.on(", ").skipNulls();

  private enum Property {
    TYPE("type"),
    BUILDER_TYPE("builderType"),
    MERGE_BUILDER("mergeBuilder"),
    PARTIAL_TO_BUILDER("partialToBuilder"),
    BUILDER_FACTORY("builderFactory"),
    SUPPRESS_UNCHECKED("suppressUnchecked"),
    ;

    private final String name;

    private Property(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name;
    }
  }

  private TypeMirror type;
  private ParameterizedType builderType;
  private BuildableType.MergeBuilderMethod mergeBuilder;
  private BuildableType.PartialToBuilderMethod partialToBuilder;
  private BuilderFactory builderFactory;
  private Excerpt suppressUnchecked;
  private final EnumSet<BuildableType_Builder.Property> _unsetProperties =
      EnumSet.allOf(BuildableType_Builder.Property.class);

  /**
   * Sets the value to be returned by {@link BuildableType#type()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code type} is null
   */
  public BuildableType.Builder type(TypeMirror type) {
    this.type = Preconditions.checkNotNull(type);
    _unsetProperties.remove(BuildableType_Builder.Property.TYPE);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#type()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public TypeMirror type() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.TYPE), "type not set");
    return type;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#builderType()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code builderType} is null
   */
  public BuildableType.Builder builderType(ParameterizedType builderType) {
    this.builderType = Preconditions.checkNotNull(builderType);
    _unsetProperties.remove(BuildableType_Builder.Property.BUILDER_TYPE);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#builderType()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public ParameterizedType builderType() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE),
        "builderType not set");
    return builderType;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#mergeBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code mergeBuilder} is null
   */
  public BuildableType.Builder mergeBuilder(BuildableType.MergeBuilderMethod mergeBuilder) {
    this.mergeBuilder = Preconditions.checkNotNull(mergeBuilder);
    _unsetProperties.remove(BuildableType_Builder.Property.MERGE_BUILDER);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#mergeBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.MergeBuilderMethod mergeBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER),
        "mergeBuilder not set");
    return mergeBuilder;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#partialToBuilder()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code partialToBuilder} is null
   */
  public BuildableType.Builder partialToBuilder(
      BuildableType.PartialToBuilderMethod partialToBuilder) {
    this.partialToBuilder = Preconditions.checkNotNull(partialToBuilder);
    _unsetProperties.remove(BuildableType_Builder.Property.PARTIAL_TO_BUILDER);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#partialToBuilder()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuildableType.PartialToBuilderMethod partialToBuilder() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER),
        "partialToBuilder not set");
    return partialToBuilder;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#builderFactory()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code builderFactory} is null
   */
  public BuildableType.Builder builderFactory(BuilderFactory builderFactory) {
    this.builderFactory = Preconditions.checkNotNull(builderFactory);
    _unsetProperties.remove(BuildableType_Builder.Property.BUILDER_FACTORY);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#builderFactory()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public BuilderFactory builderFactory() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY),
        "builderFactory not set");
    return builderFactory;
  }

  /**
   * Sets the value to be returned by {@link BuildableType#suppressUnchecked()}.
   *
   * @return this {@code Builder} object
   * @throws NullPointerException if {@code suppressUnchecked} is null
   */
  public BuildableType.Builder suppressUnchecked(Excerpt suppressUnchecked) {
    this.suppressUnchecked = Preconditions.checkNotNull(suppressUnchecked);
    _unsetProperties.remove(BuildableType_Builder.Property.SUPPRESS_UNCHECKED);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns the value that will be returned by {@link BuildableType#suppressUnchecked()}.
   *
   * @throws IllegalStateException if the field has not been set
   */
  public Excerpt suppressUnchecked() {
    Preconditions.checkState(
        !_unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED),
        "suppressUnchecked not set");
    return suppressUnchecked;
  }

  /** Sets all property values using the given {@code BuildableType} as a template. */
  public BuildableType.Builder mergeFrom(BuildableType value) {
    BuildableType_Builder _defaults = new BuildableType.Builder();
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.TYPE)
        || !value.type().equals(_defaults.type())) {
      type(value.type());
    }
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE)
        || !value.builderType().equals(_defaults.builderType())) {
      builderType(value.builderType());
    }
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER)
        || !value.mergeBuilder().equals(_defaults.mergeBuilder())) {
      mergeBuilder(value.mergeBuilder());
    }
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER)
        || !value.partialToBuilder().equals(_defaults.partialToBuilder())) {
      partialToBuilder(value.partialToBuilder());
    }
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY)
        || !value.builderFactory().equals(_defaults.builderFactory())) {
      builderFactory(value.builderFactory());
    }
    if (_defaults._unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED)
        || !value.suppressUnchecked().equals(_defaults.suppressUnchecked())) {
      suppressUnchecked(value.suppressUnchecked());
    }
    return (BuildableType.Builder) this;
  }

  /**
   * Copies values from the given {@code Builder}. Does not affect any properties not set on the
   * input.
   */
  public BuildableType.Builder mergeFrom(BuildableType.Builder template) {
    // Upcast to access private fields; otherwise, oddly, we get an access violation.
    BuildableType_Builder base = template;
    BuildableType_Builder _defaults = new BuildableType.Builder();
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.TYPE)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.TYPE)
            || !template.type().equals(_defaults.type()))) {
      type(template.type());
    }
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE)
            || !template.builderType().equals(_defaults.builderType()))) {
      builderType(template.builderType());
    }
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER)
            || !template.mergeBuilder().equals(_defaults.mergeBuilder()))) {
      mergeBuilder(template.mergeBuilder());
    }
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER)
            || !template.partialToBuilder().equals(_defaults.partialToBuilder()))) {
      partialToBuilder(template.partialToBuilder());
    }
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY)
            || !template.builderFactory().equals(_defaults.builderFactory()))) {
      builderFactory(template.builderFactory());
    }
    if (!base._unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED)
        && (_defaults._unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED)
            || !template.suppressUnchecked().equals(_defaults.suppressUnchecked()))) {
      suppressUnchecked(template.suppressUnchecked());
    }
    return (BuildableType.Builder) this;
  }

  /** Resets the state of this builder. */
  public BuildableType.Builder clear() {
    BuildableType_Builder _defaults = new BuildableType.Builder();
    type = _defaults.type;
    builderType = _defaults.builderType;
    mergeBuilder = _defaults.mergeBuilder;
    partialToBuilder = _defaults.partialToBuilder;
    builderFactory = _defaults.builderFactory;
    suppressUnchecked = _defaults.suppressUnchecked;
    _unsetProperties.clear();
    _unsetProperties.addAll(_defaults._unsetProperties);
    return (BuildableType.Builder) this;
  }

  /**
   * Returns a newly-created {@link BuildableType} based on the contents of the {@code Builder}.
   *
   * @throws IllegalStateException if any field has not been set
   */
  public BuildableType build() {
    Preconditions.checkState(_unsetProperties.isEmpty(), "Not set: %s", _unsetProperties);
    return new BuildableType_Builder.Value(this);
  }

  /**
   * Returns a newly-created partial {@link BuildableType} for use in unit tests. State checking
   * will not be performed. Unset properties will throw an {@link UnsupportedOperationException}
   * when accessed via the partial object.
   *
   * <p>Partials should only ever be used in tests. They permit writing robust test cases that won't
   * fail if this type gains more application-level constraints (e.g. new required fields) in
   * future. If you require partially complete values in production code, consider using a Builder.
   */
  @VisibleForTesting()
  public BuildableType buildPartial() {
    return new BuildableType_Builder.Partial(this);
  }

  private static final class Value extends BuildableType {
    private final TypeMirror type;
    private final ParameterizedType builderType;
    private final BuildableType.MergeBuilderMethod mergeBuilder;
    private final BuildableType.PartialToBuilderMethod partialToBuilder;
    private final BuilderFactory builderFactory;
    private final Excerpt suppressUnchecked;

    private Value(BuildableType_Builder builder) {
      this.type = builder.type;
      this.builderType = builder.builderType;
      this.mergeBuilder = builder.mergeBuilder;
      this.partialToBuilder = builder.partialToBuilder;
      this.builderFactory = builder.builderFactory;
      this.suppressUnchecked = builder.suppressUnchecked;
    }

    @Override
    public TypeMirror type() {
      return type;
    }

    @Override
    public ParameterizedType builderType() {
      return builderType;
    }

    @Override
    public BuildableType.MergeBuilderMethod mergeBuilder() {
      return mergeBuilder;
    }

    @Override
    public BuildableType.PartialToBuilderMethod partialToBuilder() {
      return partialToBuilder;
    }

    @Override
    public BuilderFactory builderFactory() {
      return builderFactory;
    }

    @Override
    public Excerpt suppressUnchecked() {
      return suppressUnchecked;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof BuildableType_Builder.Value)) {
        return false;
      }
      BuildableType_Builder.Value other = (BuildableType_Builder.Value) obj;
      if (!type.equals(other.type)) {
        return false;
      }
      if (!builderType.equals(other.builderType)) {
        return false;
      }
      if (!mergeBuilder.equals(other.mergeBuilder)) {
        return false;
      }
      if (!partialToBuilder.equals(other.partialToBuilder)) {
        return false;
      }
      if (!builderFactory.equals(other.builderFactory)) {
        return false;
      }
      if (!suppressUnchecked.equals(other.suppressUnchecked)) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(
          new Object[] {
            type, builderType, mergeBuilder, partialToBuilder, builderFactory, suppressUnchecked
          });
    }

    @Override
    public String toString() {
      return "BuildableType{"
          + "type="
          + type
          + ", "
          + "builderType="
          + builderType
          + ", "
          + "mergeBuilder="
          + mergeBuilder
          + ", "
          + "partialToBuilder="
          + partialToBuilder
          + ", "
          + "builderFactory="
          + builderFactory
          + ", "
          + "suppressUnchecked="
          + suppressUnchecked
          + "}";
    }
  }

  private static final class Partial extends BuildableType {
    private final TypeMirror type;
    private final ParameterizedType builderType;
    private final BuildableType.MergeBuilderMethod mergeBuilder;
    private final BuildableType.PartialToBuilderMethod partialToBuilder;
    private final BuilderFactory builderFactory;
    private final Excerpt suppressUnchecked;
    private final EnumSet<BuildableType_Builder.Property> _unsetProperties;

    Partial(BuildableType_Builder builder) {
      this.type = builder.type;
      this.builderType = builder.builderType;
      this.mergeBuilder = builder.mergeBuilder;
      this.partialToBuilder = builder.partialToBuilder;
      this.builderFactory = builder.builderFactory;
      this.suppressUnchecked = builder.suppressUnchecked;
      this._unsetProperties = builder._unsetProperties.clone();
    }

    @Override
    public TypeMirror type() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.TYPE)) {
        throw new UnsupportedOperationException("type not set");
      }
      return type;
    }

    @Override
    public ParameterizedType builderType() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE)) {
        throw new UnsupportedOperationException("builderType not set");
      }
      return builderType;
    }

    @Override
    public BuildableType.MergeBuilderMethod mergeBuilder() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER)) {
        throw new UnsupportedOperationException("mergeBuilder not set");
      }
      return mergeBuilder;
    }

    @Override
    public BuildableType.PartialToBuilderMethod partialToBuilder() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER)) {
        throw new UnsupportedOperationException("partialToBuilder not set");
      }
      return partialToBuilder;
    }

    @Override
    public BuilderFactory builderFactory() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY)) {
        throw new UnsupportedOperationException("builderFactory not set");
      }
      return builderFactory;
    }

    @Override
    public Excerpt suppressUnchecked() {
      if (_unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED)) {
        throw new UnsupportedOperationException("suppressUnchecked not set");
      }
      return suppressUnchecked;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof BuildableType_Builder.Partial)) {
        return false;
      }
      BuildableType_Builder.Partial other = (BuildableType_Builder.Partial) obj;
      if (type != other.type && (type == null || !type.equals(other.type))) {
        return false;
      }
      if (builderType != other.builderType
          && (builderType == null || !builderType.equals(other.builderType))) {
        return false;
      }
      if (mergeBuilder != other.mergeBuilder
          && (mergeBuilder == null || !mergeBuilder.equals(other.mergeBuilder))) {
        return false;
      }
      if (partialToBuilder != other.partialToBuilder
          && (partialToBuilder == null || !partialToBuilder.equals(other.partialToBuilder))) {
        return false;
      }
      if (builderFactory != other.builderFactory
          && (builderFactory == null || !builderFactory.equals(other.builderFactory))) {
        return false;
      }
      if (suppressUnchecked != other.suppressUnchecked
          && (suppressUnchecked == null || !suppressUnchecked.equals(other.suppressUnchecked))) {
        return false;
      }
      return _unsetProperties.equals(other._unsetProperties);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(
          new Object[] {
            type,
            builderType,
            mergeBuilder,
            partialToBuilder,
            builderFactory,
            suppressUnchecked,
            _unsetProperties
          });
    }

    @Override
    public String toString() {
      return "partial BuildableType{"
          + COMMA_JOINER.join(
              (!_unsetProperties.contains(BuildableType_Builder.Property.TYPE)
                  ? "type=" + type
                  : null),
              (!_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_TYPE)
                  ? "builderType=" + builderType
                  : null),
              (!_unsetProperties.contains(BuildableType_Builder.Property.MERGE_BUILDER)
                  ? "mergeBuilder=" + mergeBuilder
                  : null),
              (!_unsetProperties.contains(BuildableType_Builder.Property.PARTIAL_TO_BUILDER)
                  ? "partialToBuilder=" + partialToBuilder
                  : null),
              (!_unsetProperties.contains(BuildableType_Builder.Property.BUILDER_FACTORY)
                  ? "builderFactory=" + builderFactory
                  : null),
              (!_unsetProperties.contains(BuildableType_Builder.Property.SUPPRESS_UNCHECKED)
                  ? "suppressUnchecked=" + suppressUnchecked
                  : null))
          + "}";
    }
  }
}
