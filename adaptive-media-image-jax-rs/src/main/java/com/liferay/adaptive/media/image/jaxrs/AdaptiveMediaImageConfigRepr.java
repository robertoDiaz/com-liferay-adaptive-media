package com.liferay.adaptive.media.image.jaxrs;

import com.liferay.adaptive.media.image.configuration.ImageAdaptiveMediaConfigurationEntry;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * It serves as a proxy for the API layer for a
 * {@link ImageAdaptiveMediaConfigurationEntry}.
 * It also converts a configuration into its {@link String} representation.
 *
 * @author Alejandro Hernández
 */
@XmlRootElement(name = "config")
public class AdaptiveMediaImageConfigRepr {

	public AdaptiveMediaImageConfigRepr() {
	}

	public AdaptiveMediaImageConfigRepr(
		ImageAdaptiveMediaConfigurationEntry entry) {

		_name = entry.getName();
		String width = entry.getProperties().get("width");

		if (width != null) {
			_width = Integer.parseInt(width);
		}

		String height = entry.getProperties().get("height");

		if (height != null) {
			_height = Integer.parseInt(height);
		}

		_uuid = entry.getUUID();
	}

	public int getHeight() {
		return _height;
	}

	public String getName() {
		return _name;
	}

	public String getUuid() {
		return _uuid;
	}

	public int getWidth() {
		return _width;
	}

	public void setHeight(int height) {
		_height = height;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public void setWidth(int width) {
		_width = width;
	}

	@Override
	public String toString() {
		return _name + ":" + _uuid + ":width=" + _width + ";height=" + _height;
	}

	private int _height = -1;
	private String _name;
	private String _uuid;
	private int _width = -1;

}