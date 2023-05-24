# FurlongFlipper
Please only input positive numbers for now.
You can choose between:
1. LENGTH _wherein Universal Unit (below) is the mode of choice for conversion._
  - `UNIVERSAL UNIT`, equivalent to 25146km or 15625mi
  - `METRIC`
    - `cm`, centimeter
    - `m`, meter
    - `km`, kilometer
  - `IMPERIAL`
    - `in`, inch
    - `ft`, foot
    - `furlong`, 1/8 mi
    - `mi`, mile
    - `nmi`, nautical mile
2. TIME _wherein hour is the mode of choice for conversion._
    - `ms`, millisecond
    - `sec`, second
    - `min`, minute
    - `hr`, hour
    - `day`
    - `wk`, week
    - `fortnight` (or 2 weeks)
    - `mon`, month
    - `yr`, year
    - `dec`, decade
    - `cent`, century
    - `mil`, millenium
3. SPEED _wherein there are two different methods to input speed._
   - `CURRENT` (i.e. input '60' mph; assumed to be 60 mi/1 hr)
   - `AVERAGE` (i.e. input '120' mi / '2' hr, then simplify to 60mph)
_Because speed is ultimately just dividing a unit of distance over a unit of time, it should be programmed as such, and essentially reuse the code from those with the extra step of dividing them._
