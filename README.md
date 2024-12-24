# Multistyle - for styling!
Multistyle is a tool which allows you to write all your styles in one file and export it to different platforms (like web, android, flutter e.t.c)

You can see examples folder

## !This tool still in under development, not recommended for production yet!

v0.0.1 - single-line colors version:
 - [x] Parse multistyle file (colors)
 - [x] Output multistyle file to css (colors)
> v0.0.1 version is about colors

Example 
```html
<colors>
    <hello>#AAAAAA</hello>
    <world>#BBBBBB</world>
</colors>
```
will be
```css
:root {
	--hello: #AAAAAA;
	--world: #BBBBBB;
}
```
<hr>

v0.0.2 - single-line fonts version:
 - [ ] Parse multistyle file (fonts)
 - [ ] Output multistyle file to css (fonts)
 - [ ] Add rgb, rgba color formats
> v0.0.2 is about fonts and new color formats

Example
```html
<families>
    <title>ExampleA (serif)</title>
    <subtitle>ExampleBB</subtitle>
</families>
```
will be
```css
@import ("https://example.com/ExampleA/serif...");
@import ("https://example.com/ExampleB...");

:root {
	--title-family: ExampleA, serif;
	--subtitle-family: ExampleB, sans-serif;
}
```
and new color formats (might be changed)
```html
<colors>
    <!--RGB-->
    <hello>123 123 123</hello> 
    <!--RGBA-->
    <world>123 123 123 12</world>
    
    <!--or for better readability-->
    <hello-two>@rgb(123, 123, 123)</hello-two>
    <world-two>@rgba(123, 123, 123, 12)</world-two>
</colors>
```
will be
```css
:root {
	--hello: rgb(123, 123, 123);
	--world: rgba(123, 123, 123, 12);
}
```